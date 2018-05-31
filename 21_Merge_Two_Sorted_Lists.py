
'''Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.'''
class Solution(object):
    def mergeTwoLists(self, l1, l2):
        '''
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        '''
        print(l1)
        print(l2)

class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

if __name__ == "__main__":
    l1 = ListNode(1)
    l1.next = ListNode(2)
    l1.next = ListNode(4)

    l2 = ListNode(1);
    l2.next = ListNode(3);
    l2.next = ListNode(4);
    solution = Solution()
    solution.mergeTwoLists(l1,l2)
