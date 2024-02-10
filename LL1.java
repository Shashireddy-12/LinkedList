 class LL1
{
    private static int size;
    LL1()
    {
        this.size=0;
    }
    static Node head;
    class Node
    {
       // Node head;
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public  void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
        head=newNode;
            return;
        }
        Node currnode=head;
        while(currnode.next!=null)
        {
            currnode=currnode.next;
        }
        currnode.next=newNode;
    }
    public void printList()
    {
        
        if(head==null)
        {
            System.out.println("list is empty");
            return;
     }
     Node curnod=head;
     while(curnod!=null)
     {
        System.out.print(curnod.data+"-->");
        curnod=curnod.next;
     }
     System.out.println("NULL");
     
    }
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("empty list");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("empty list");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondLast=head;
        Node Last=head.next;
        while(Last.next!=null)
        {
            Last.next=Last;
            secondLast.next=secondLast;

        }
        secondLast.next=null;
    }
    public int getsize()
    {
        return size;
    }
    public void reversell()
    {
        if(head==null||head.next==null)
        {
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;

    }


    public static void main(String a[])
    {
        LL1 list=new LL1();
        list.addFirst("a");
        list.addFirst("b");
        list.printList();
        list.addLast("c");
        list.printList();
        list.deleteFirst();
        list.printList();
       // list.deleteLast();
       // list.printList();
       // list.deleteFirst();
       // list.printList();
        list.reversell();
        list.printList();
        System.out.println(list.getsize());
    }
    }