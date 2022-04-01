
public class Btree<k> {
    
    private Node root;
         private int theSize;

     
    public boolean isEmpty() 
    {
        return root == null;
    }
    
    public boolean search(int val)
     {
         return search(root, val);
     }
    
     private boolean search(Node nodes, int val)
     {
         
         boolean found = false;
         while ((nodes != null) && !found)
         {
            
             int rval = nodes.getData().getStudent_Id();
             if (val < rval)
                 nodes = nodes.getPrev();
             else if (val > rval)
                 nodes = nodes.getNext();
             else
             {
                 found = true;
                 break;
             }
             found = search(nodes, val);
         }
         
         
         return found;
     }
     
      public int jump(int val)
     {
         return jump(root, val);
     }
    
     private int jump(Node nodes, int val)
     {
         int count =-1;
         boolean found = false;
         while ((nodes != null) && !found)
         {
             count++;
             int rval = nodes.getData().getStudent_Id();
             if (val < rval)
                 nodes = nodes.getPrev();
             else if (val > rval)
                 nodes = nodes.getNext();
             else
             {
                 found = true;
                 break;
             }
           
         }
         
         return count;
     }


    
     public void deleteRecursively(StudentData newValue) 
    {
        root = deleteRecursively(root, newValue);
        theSize--;
    }
    private Node deleteRecursively(Node root, StudentData value) {

        if (root == null)
            return root;

        if (value.getStudent_Id() < root.getData().getStudent_Id()) {
            root.setPrev(deleteRecursively(root.getPrev(), value));
        } else if (value.getStudent_Id() > (int) root.getData().getStudent_Id()) {
            root.setNext(deleteRecursively(root.getNext(), value));
        } else {

            if (root.getPrev() == null) {
                return root.getNext();
            } else if (root.getNext() == null)
                return root.getPrev();

            root.setData(min(root.getNext())); 
            root.setNext(deleteRecursively(root.getNext(), root.getData()));
        }

        return root;

    }

   
    public  StudentData min(Node root) {
        StudentData minimum = root.getData();
        while (root.getPrev() != null) {
            minimum =root.getPrev().getData();
            root = root.getPrev();
        }
        return minimum;
    }

    
    
     public void insertRecursively(StudentData newValue) 
    {
        root = insertRecursively(newValue, root);
        theSize++;
    }
    
    private Node insertRecursively(StudentData newValue, Node<k> tempNode) 
    {
        if( tempNode == null )
            return new Node(null,newValue,null);
            
        if( newValue.getStudent_Id() < tempNode.getData().getStudent_Id())
            tempNode.setPrev(insertRecursively(newValue, tempNode.getPrev()));
        
        else
            tempNode.setNext(insertRecursively(newValue, tempNode.getNext()));
        
        
        return tempNode;
    }
    
    public void printPreorder()
    {
        printPreorder(root);
    }
    
    private void printPreorder(Node<k> tempNode)
    {
        if(tempNode == null)
            return;
        
        System.out.print(tempNode.getData().getStudent_Id() + " ");
        printPreorder(tempNode.getPrev());
        printPreorder(tempNode.getNext());     
    }
    
    public void printInorder()
    {
        printInorder(root);
    }
    
    private void printInorder(Node tempNode)
    {
        if(tempNode == null)
            return;
           
         printInorder(tempNode.getPrev());
        System.out.print(tempNode.getData().getStudent_Id() + " ");
        printInorder(tempNode.getNext());        
    }
    
    public void printPostorder()
    {
        printPostorder(root);
    }
    
    private void printPostorder(Node tempNode)
    {
        if(tempNode == null)
            return;
        
          printPostorder(tempNode.getPrev());
       printPostorder(tempNode.getNext());  ;    
        System.out.print(tempNode.getData().getStudent_Id() + " ");
    }
    
}
