class Linked{
    static class Node{
        int data;
        Node next,prev;

        public Node(int val){
            data = val;
            next = prev = null;
        }
    }

    Node head;
    public Linked(){
        head = null;
    }

    public void addFirst(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            newNode.next = newNode.prev = newNode;
        }
        else{
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            newNode.next = newNode.prev = head;
        }
        else{
            newNode.next  = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
        }
    }

    public void addPos(int pos,int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
        }
        else if(pos==1) {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode; 
        }
        else{
            Node trav = head;
            for(int i=1;i<pos;i++){
                trav = trav.next;
            }

            newNode.next = trav;
            newNode.prev = trav.prev;
            trav.prev.next = newNode;
            trav.prev = newNode;
        }
    }

    public void deleteFirst(){
        if(head == null){
            return;
        }
        else if(head == head.next){
            head = null;
        }
        else{
            // Node temp = head;
            head.prev.next = head.next;
            head.next.prev = head.prev;
            head = head.next;
        }
    }

    public void deleteLast(){
        if(head == null){
            return;
        }
        else if(head == head.next){
            head = null;
        }
        else{
            head.prev = head.prev.prev;
            head.prev.next = head;
        } 
    }

    public void deletePos(int pos){
        if(head == null) return;
        else if(pos == 1){
            head.next.prev = head.prev;
            head = head.next;
            head.prev.next = head;
        }
        else{
            Node trav = head;
            
            for(int i=1;i<pos;i++){
                trav = trav.next;
                if(trav == head) return;
            }
            trav.prev.next = trav.next;
            trav.next.prev = trav.prev;

        }
    }

    public void fDisplay(){
        if(head==null){
            return;
        }
        Node trav= head.next;
        System.out.println("Forward display: ");
        System.out.print(head.data + " ");
        while(trav != head){
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }

    public void rDisplay(){
        if(head==null){
            return;
        }
        System.out.println("Reverse Display: ");
        Node trav = head.prev;
        while(trav!= head){
            System.out.print(trav.data + " ");
            trav = trav.prev;
        }
        System.out.print(trav.data);
        System.out.println();
    }


    public void deleteAll(){
        head = null;
    }

}

public class LinkedList{
    public static void main(String[] args){
        Linked l = new Linked();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.addFirst(50);
        l.fDisplay();
        l.rDisplay();
        l.deletePos(5);
        l.fDisplay();
    }
}