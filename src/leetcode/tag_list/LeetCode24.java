package leetcode.tag_list;


/**
给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
示例 1：
输入：head = [1,2,3,4]
输出：[2,1,4,3]
<p>
示例 2：
输入：head = []
输出：[]
<p>
示例 3：
输入：head = [1]
输出：[1]
<p>
提示：链表中节点的数目在范围 [0, 100] 内
0 <= Node.val <= 100
 */
public class LeetCode24 {

    public ListNode swapPairs(ListNode head) {
        // 特殊情况
        if (head == null || head.next == null) {
            return head;
        }
        // 一般情况
        // 依次取出三个节点
        ListNode secondNode = head.next;
        ListNode thirdNode = secondNode.next;
        // 第三个节点，交给递归处理
        secondNode.next = swapPairs(thirdNode);
        // 递归完成后，认为后面的都排好序了，下面处理这两个节点
        head.next = secondNode.next;
        secondNode.next = head;
        return secondNode;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
