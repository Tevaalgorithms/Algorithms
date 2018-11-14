package linkedlist;
public class LinkedList 
{
    Node head;
    
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
            this.next = null;
        }     
    }
           
    public void addNode_Front(int d)
    {
        // Create a new node with the given data
        Node new_head = new Node(d);
        
        // Set the previous head as NEW NODE's next element
        new_head.next = head;
        
        // move the head to point to the new node
        head = new_head;  
    }
    
    public void addNode_Last(int d)
    {
      // Create a new node with the given data
      Node new_last = new Node(d);
      
      new_last.next = null;
      
      if(head == null)
      {
          head = new_last;
          return;
      }
      
      Node last = head;
      
      while(last.next != null)
      {
        last = last.next;
      }
      
      last.next = new_last;
    }
    
    public void addNode_Middle(int d, int pre)
    {
        Node previous = null;
        
        Node previous_node = head;
        
        while(previous_node.next!=null)
        {
            if(previous_node.data == pre)
            {
                previous = previous_node;
                break;
            }
            previous_node = previous_node.next;
        }
        if (previous == null) return;
        
        Node newNode = new Node(d);
        
        Node old_next_to_pre = previous.next;
        
        previous.next = newNode;
        
        newNode.next = old_next_to_pre;          
    }
    
    public void printList() 
    { 
        Node n = head; 
        while (n != null) 
        { 
            System.out.print(n.data+" "); 
            n = n.next; 
        } 
    } 
            
    public void deleteFrontNode()
    {
        Node h = head;
        Node nh = h.next;
        h = null;
        head = nh;
    }
    
    public void deleteLastNode()
    {
        Node h = head;
        Node p = null;
        while(h.next != null)
        {   p = h;
            h = h.next;
        }
        //After while loop iteration now h is the last node
        // p is the node right before the last node
        p.next = null;
        h = null;
    }
    
    public void deleteSpecificNode(int d)
    {
        // Case 1: May be the given key is in the head node
        // Case 2: May be the given key is anywhere in the list
        // Case 3: May be the given key is not located
        
        Node h = head;
        Node temp = null;
        
        // Case 1
        
        if(h.data == d)
        {
            head = h.next;
            return;
        }
        
        // Case 2
        while(h.next != null)
        {
            temp = h;
            h = h.next;
            if(h.data == d)
            {
                // Get the node next to h
                Node nh = h.next;
                temp.next = nh;
                h.next = null;
                return;
            }           
        }
        
        // Case 3
        System.out.println("The given key is not present in the list \n");
    }
    
    public void deleteSpecificPoistion(int p)
    {
        Node h = head;
        Node temp = null;
        int j = 1;
       
        while(h.next!=null)
        {
            if (p==0)
            {
                temp = h.next;
                head = temp;
                h = null;
                return;
            }
            if (j==p)
            {                
                temp = h;               
                Node nn = h.next;
                temp.next = nn;
                h.next = null;
            }
            j++;
            h = h.next;
        }
        if (p > j)
        {
            System.out.println("The given position is out of range");
        }
    }
    
    
    public static void main(String[] args) 
    {
        /* Start with the empty list. */
        LinkedList llist = new LinkedList(); 
  
        llist.head  = new Node(1); 
        Node second = new Node(2); 
        Node third  = new Node(3); 
  
        /* Three nodes have been allocated  dynamically. 
          We have refernces to these three blocks as first,   
          second and third 
  
          llist.head        second              third 
             |                |                  | 
             |                |                  | 
         +----+------+     +----+------+     +----+------+ 
         | 1  | null |     | 2  | null |     |  3 | null | 
         +----+------+     +----+------+     +----+------+ */
  
        llist.head.next = second; // Link first node with the second node 
  
        /*  Now next of first Node refers to second.  So they 
            both are linked. 
  
         llist.head        second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 1  |  o-------->| 2  | null |     |  3 | null | 
        +----+------+     +----+------+     +----+------+ */
  
        second.next = third; // Link second node with the third node 
  
        /*  Now next of second Node refers to third.  So all three 
            nodes are linked. 
  
         llist.head        second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 1  |  o-------->| 2  |  o-------->|  3 | null | 
        +----+------+     +----+------+     +----+------+ */
        
        System.out.print("After Creating a linked list [1->2->3]" + "\n");     
        llist.printList();
        
        llist.addNode_Front(50);        
        System.out.print("\nAfter adding front node [50]" + "\n");         
        llist.printList();
        
        llist.addNode_Last(150);        
        System.out.print("\nAfter adding last node [150]" + "\n");         
        llist.printList();
        
        llist.addNode_Middle(300, 2);        
        System.out.print("\nAfter addming middle node [300] after node [2]" + "\n");         
        llist.printList();
        
        llist.deleteFrontNode();
        System.out.print("\nAfter deleting the front node [50]" + "\n");         
        llist.printList();
        
        llist.deleteLastNode();
        System.out.print("\nAfter deleting the front node [150]" + "\n");         
        llist.printList();
        
        llist.deleteSpecificNode(2);
        System.out.print("\nAfter deleting the front node 2" + "\n");         
        llist.printList();
        
        llist.deleteSpecificPoistion(5);
        System.out.print("\nAfter deleting the front node from 0th position" + "\n");         
        llist.printList();
                        
    }
    
}
