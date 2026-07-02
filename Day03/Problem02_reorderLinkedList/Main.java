package Day03.Problem02_reorderLinkedList;

public class Main {

    public static void main(String[] args) {

        // Creating the Linked List
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println("Original Linked List:");
        printList(head);

        reorderList(head);

        System.out.println("\nReordered Linked List:");
        printList(head);
    }

    // Print Linked List
    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Find Middle Node
    public static Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Reverse Linked List
    public static Node reverse(Node head) {

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = previous;

            previous = current;

            current = next;
        }

        return previous;
    }

    // Reorder Linked List
    public static void reorderList(Node head) {

        Node middle = findMiddle(head);

        Node second = reverse(middle);

        Node first = head;

        while (second.next != null) {

            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}

// Node Class
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}