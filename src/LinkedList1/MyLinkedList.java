package LinkedList1;

public class MyLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        // Calculate the length of the linked list
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Calculate the actual rotation point
        int rotationPoint = k % length;
        if (rotationPoint == 0) {
            return head; // No rotation needed
        }

        // Find the (n - rotationPoint)th node from the beginning
        int stepsToRotate = length - rotationPoint;
        ListNode prev = null;
        curr = head;
        for (int i = 0; i < stepsToRotate; i++) {
            prev = curr;
            curr = curr.next;
        }

        // Adjust pointers to rotate the list
        prev.next = null; // Break the list at the rotation point
        ListNode newHead = curr;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head; // Connect the last node to the original head

        return newHead;
    }

    // Helper method to print the linked list
    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedList solution = new MyLinkedList();

        // Example usage:
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        int k = 2;
        System.out.println("Original List:");
        solution.printList(head);

        ListNode rotatedHead = solution.rotateRight(head, k);
        System.out.println("List after rotating by " + k + " places to the right:");
        solution.printList(rotatedHead);
    }

}
