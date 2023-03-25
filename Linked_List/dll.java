package Linked_List;

public class dll {
    
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){  // not head.prev
            head.prev = node;
        }
        head = node; // not node = head
    }

    public void display(){
        Node node = head;

        Node last = null; // reverse ku

        // print forward
        System.out.print("null" );
        while(node != null){ // not head.prev
            System.out.print(" <=> " + node.val );
            last = node;
            node = node.next;
        } // return node null 
        System.out.println(" <=> " + "null");

        // print backwards'
        System.out.println("Print in Reverse");
        System.out.print("null" );
        while(last != null){
            System.out.print(" <=> " + last. val );
            last = last.prev;
        }
        System.out.println(" <=> " + "null");
    }





    // node details to be kept private
    // accessible through public outer class from diff class as well
    private class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
