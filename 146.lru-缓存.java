import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

/*
 * @lc app=leetcode.cn id=146 lang=java
 *
 * [146] LRU 缓存
 */

// @lc code=start
class LRUCache {

    private class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;

        public DLinkedNode() {
        }

        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private DLinkedNode head;
    private DLinkedNode tail;
    private HashMap<Integer, DLinkedNode> map = new HashMap<>();
    private int size;
    private int capacity;

    public LRUCache(int capacity) {
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
        size = 0;
        this.capacity = capacity;
    }

    public int get(int key) {
        DLinkedNode node = map.get(key);
        if (node == null) {
            return -1;
        }
        remove(node);
        addToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = map.get(key);
        if (node == null) {
            node = new DLinkedNode(key, value);
            map.put(key, node);
            addToHead(node);
            size++;
            if (size > capacity) {
                DLinkedNode last = removeTail();
                map.remove(last.key);
                size--;
            }
        } else {
            node.value = value;
            remove(node);
            addToHead(node);
        }
    }

    private void remove(DLinkedNode node) {
        DLinkedNode pre = node.prev;
        DLinkedNode next = node.next;
        pre.next = next;
        next.prev = pre;
        node.next = null;
        node.prev = null;
    }

    private void addToHead(DLinkedNode node) {
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    private DLinkedNode removeTail() {
        DLinkedNode last = tail.prev;
        remove(last);
        return last;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end
