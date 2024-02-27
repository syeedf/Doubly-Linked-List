
public class doubleLink {
    
    node head; 
    node tail;

   public void display() {  
        //Node current will point to head  
        node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
    public void delete(int data){
        node current= head;
        while (current.data!= data) {
            if (current.next==null) {
                break;
            }
            current= current.next;
        }
        if (current.data==data) {
            current.next.prev= current.prev;
            current.prev.next = current.next;
            
        }
        else{
            System.out.println("That value is not in the DLL!");
        }

    }
  

    public void insertBeginning(int data)
{
        node newNode= new node();
        newNode.data=data;
        newNode.prev=null;
        newNode.next=head;
        if (head!=null) {
            head.prev = newNode;
        }
        head = newNode;

}

    public void insertBetween(node prev_Node, int data){

        node newNode= new node();
        newNode.data= data;
        newNode.next = prev_Node.next;
        prev_Node.next=newNode;
        newNode.prev=prev_Node;
        if(newNode.next!= null)
        {
            newNode.next.prev = newNode;
        }
    }


}

        
