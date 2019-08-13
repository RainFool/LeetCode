package android;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MessageQueue {
    Message[] mItems;

    private int mPutIndex;
    private int mTakeIndex;

    private int mCount;

    Lock mLock;

    Condition getCondition;
    Condition addCondition;

    public MessageQueue() {
        mItems = new Message[50];
        mLock = new ReentrantLock();
        getCondition = mLock.newCondition();
        addCondition = mLock.newCondition();
    }

    Message next() {
        Message msg = null;

        try {
            mLock.lock();
            while (mCount <= 0) {
                System.out.println("队列为空阻塞读锁");
                getCondition.await();
            }
            msg = mItems[mTakeIndex];
            mItems[mTakeIndex] = null;
            mTakeIndex = (++mTakeIndex >= mItems.length) ? 0 : mTakeIndex;
            mCount--;
            addCondition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mLock.unlock();
        }
        return msg;
    }

    public void enqueueMsg(Message message) {
        try {
            mLock.lock();
            while (mCount > mItems.length) {
                System.out.println("队列满阻塞写锁");
                addCondition.await();
            }
            mItems[mPutIndex] = message;
            mPutIndex = (++mPutIndex >= mItems.length) ? 0 : mPutIndex;
            mCount++;
            getCondition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            mLock.unlock();
        }
    }
}
