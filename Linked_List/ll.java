package Linked_List;

public class ll {
    
    private Node node;
    private Node head;
    private Node tail;
    public int size;

    public ll(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node  = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) // first ele
            tail = head;
        
            size++;

    } 

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        
        // for current traversal
        Node temp = head;

        // till prev index
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        
        Node node = new Node(val, temp.next);
        
        temp.next = node;
        size++;
    }

    public void insertLast(int val){
        if(tail == null){ // new node
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        
        tail.next = node;
        tail = node;
        
        size++;
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0)
            return deleteFirst();
        if (index == size-1)
            return deleteLast();
        
        Node prev = get(index-1);
        int val = prev.next.val;

        prev.next = prev.next.next;

        return val;
    }

    public int deleteLast(){
        if(size <= 1)
            return deleteFirst();
        
        Node secondLast = get(size-2); // index starts from 0
        int val = tail.val; // later values will change, so only fetch val now istelf
        tail = secondLast;
        tail.next = null;

        size--;
        return val;
    }

    // inp a val, fetch its Node
    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null; 
    }

    // inp index, fetch its Node
    public Node get(int index){
        Node node = head;

        // less than index, then only node.next..
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(head != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    
}
