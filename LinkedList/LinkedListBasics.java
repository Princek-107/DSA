
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    public static Node convertToLL(int[] arr){
        Node head=new Node(arr[0]);
        Node temp;
        Node movers=head;
        for(int i=1;i<arr.length;i++){
            temp=new Node(arr[i]);
            movers.next=temp;
            movers=temp;
        }
        return head;
    }
    public static Node printer(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        return head;
    }
    public static Node deleteHead(Node head){
        if(head==null){
            return head;
        }
        head=head.next;
        return head;
    }
    public static Node deleteTale(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static Node deletePos(Node head,int k){
        if(head==null){
            return null;
        }
        int cnt=1;
        Node temp=head;
        Node prev=null;
        if(k==1){
            head=head.next;
            return head;
        }
        while(temp!=null){
            if(k==cnt){
                prev.next=prev.next.next;
                break;
            }
            cnt++;
            prev=temp;
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static Node deleteVal(Node head,int val){
        if(head==null){
            return null;
        }
        Node temp=head;
        Node prev=null;
        if(temp.data==val){
            head=head.next;
            return head;
        }
        while(temp!=null){
            if(temp.data==val){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static Node insertHead(Node head,int el){
        Node temp=new Node(el,head);
        return temp;
    }
    public static Node insertTail(Node head,int el){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node x=new Node(el);
        temp.next=x;
        return head;
    }
    public static Node insertPos(Node head,int el,int k){
        int cnt=0;

        Node temp=head;
        if(head==null){
            if(k==1){
            return new Node(el,head);
            }
            else{
                return head;
            }
        }
        if(k==1){
            return new Node(el,head);
        }
        Node prev=head;
        while(temp!=null){
            cnt++;
            if(cnt==(k-1)){
                Node x=new Node(el,temp.next);
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
    
        return head;
    }
    public static Node insertVal(Node head,int el,int val){
        Node temp=head;
        if(head==null){
            return new Node(el,head);
            }
        if(head.data==val){
            return new Node(el,head);
        }
    
        while(temp!=null){
            if(temp.next.data==val){
                Node x=new Node(el,temp.next);
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
    
        return head;
    }
}
class linklist{
    public static void main(String[] args) {
        int[] arr={5,7,8,9,3};
        Node y=new Node(arr[0]);
        Node head=y.convertToLL(arr);
        // System.out.println(head.data);
        // Node temp=head;
        // int cnt=0;
        // while(temp!=null){
        //     System.out.print(temp.data + " ");
        //     temp=temp.next;
        //     cnt++;
        // }
        // System.out.println();
        // System.out.print(cnt);
        // System.out.println(y.data);
        // Node x=y.deleteHead(head);
        // Node x=y.deleteTale(head);
        // y.printer(x);
        // Node x=y.deletePos(head,3);
        // y.printer(x);
        // Node x=y.deleteVal(head,5);
        // y.printer(x);
        // Node x=y.insertHead(head,15);
        // y.printer(x);
        // Node x=y.insertTail(head,15);
        // y.printer(x);
        // Node x=y.insertPos(head,15,3);
        // y.printer(x);
        Node x=y.insertVal(head,15,8);
        y.printer(x);
        
    }
}