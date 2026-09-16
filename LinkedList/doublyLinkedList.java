class Node{
    int data;
    Node next;
    Node back;
    
    Node(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
    Node(int data,Node next,Node back){
        this.data=data;
        this.next=next;
        this.back=back;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    } 
    public static Node convToDLL(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            prev.next=temp;
            temp.back=prev;
            prev=temp;
        }
        return head;
    }
    public Node delHead(Node head){
        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;
        return head;
    }
    public Node delTail(Node head){
        Node temp=head;
        Node prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        temp.back=null;
        return head;
    }
}
class doublyLInkList{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node obj=new Node(0);
        Node head=obj.convToDLL(arr);
        // obj.print(head);
        // Node x=obj.delHead(head);
        // obj.print(x);
        Node x=obj.delTail(head);
        obj.print(x);

    }
}