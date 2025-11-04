import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Main {

    // Function to print linked list in reverse
    public static void reverse(Node head) {
        if (head == null) return;  // base case

        // Recursive call to reach end of list
        reverse(head.next);

        // Print data while returning
        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements

        if (n == 0) return;

        Node head = new Node(sc.nextInt());
        Node temp = head;

        // Build linked list
        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }

        // Print in reverse
        reverse(head);
    }
}
