
public class Node<k> {
    
    private Node<k> prev;
        private StudentData  data;
        private Node<k> next;
        
        
        public Node(Node<k> p, StudentData d, Node<k> n)
        { 
            prev = p;
            data = d;
            next = n;
        }

    
    public Node<k> getPrev() {
        return prev;
    }

    
    public void setPrev(Node<k> prev) {
        this.prev = prev;
    }
    
    public Node<k> getNext() {
        return next;
    }

    public void setNext(Node<k> next) {
        this.next = next;
    }

   
    public StudentData getData() {
        return data;
    }

    
    public void setData(StudentData data) {
        this.data = data;
    }
    
    
    
}
