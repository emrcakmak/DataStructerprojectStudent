import java.util.*;

public class ListStudent<k> {
     private Node <k> L ;
    private Node <k> R;
    private int theSize;
    
    public int size()
    {
        return theSize;
    }

    public int getTheSize() {
        return theSize;
    }
    
    public String İD() {
         String rStr = "[ ";
         
          

        Node<k> temp = L.getNext();
        for(int i=0; i<theSize; i++)
        {    
            rStr = rStr + temp.getData().getStudent_Id()+ " ";
         temp=temp.getNext();
        }    
        rStr = rStr + "]";

        return rStr;     
    
}
   
    
   public int get(int idx)
    {
        
        
        return getNode(idx).getData().getStudent_Id();
    }
    
    public void Dis(){
           
             Node<k> temp = L.getNext();
              HashSet<String> set =new HashSet<>();
         for(int i=0; i<theSize; i++)
        {    
            set.add(temp.getData().getName());
         temp=temp.getNext();
         
        }    
        
        for(String t :set){
            System.out.print(t+" ");
        }
   
      }
    
     public void Dub(){
           
             Node<k> temp = L.getNext();
               String [] tonkns =new  String[theSize];
             HashMap<String,Integer> map =new  HashMap<>();
             int count;
         for(int i=0; i<theSize; i++)
        {   
          
      tonkns[i]=temp.getData().getName();
         temp=temp.getNext();
        }    
        
        for(String t :tonkns){
            String dubl = t;
            if(map.containsKey(dubl)){
            count =map.get(dubl);   
            map.put(dubl, count+1);
            }
            else 
                map.put(dubl, 1);
            
        }
          System.out.println("Duble:");
          System.out.println(map);
      }
    
    public ListStudent()
    {
        clear ();
    }  
    
    
    
     public boolean varmı(int idx)
    {
        Node<k> temp = L.getNext();
    
        for(int i=0;i<theSize;i++){
       
        if(temp.getData().getStudent_Id()==idx){
         
        return true;
        }    
        temp=temp.getNext();
        }
       return false;
          
    
}
     public void Hashvarmı(int idx)
    {
        Node<k> temp = L.getNext();
    int count=0;
        for(int i=0;i<theSize;i++){
       count++;
        if(temp.getData().getStudent_Id()==idx){
            System.out.println("Hash:"+count);
        
        }    
        temp=temp.getNext();
        }
       
          
    
}
    
    public void add(int idx, StudentData x)
    {
        if(idx < 0 || idx > theSize)
            throw new IndexOutOfBoundsException("Index " + idx + "; size " + theSize);
        
        Node<k> p = getNode(idx);
        
        Node<k> newNode = new Node<>(p.getPrev(), x , p);
        newNode.getPrev().setNext(newNode);
        p.setPrev(newNode); 
        
        theSize++;
    }
    
    
    
    public void remove(int idx)
    {
        
        
       
         Node<k> p = gettnode(idx);
        p.getPrev().setNext(p.getNext()); 

         p.getNext().setPrev(p.getNext()); 
    
        theSize--;
        
        
    }
    
    private Node<k> getNode(int idx)
    {
        Node<k> p;
            
        if( idx <= theSize / 2 )
        {
            p = L.getNext();
            for( int i = 0; i < idx; i++ )
                p = p.getNext();            
        }
        else
        {
            p = R;
            for( int i = theSize; i > idx; i-- )
                p = p.getPrev();
        } 
        
        return p;
    }
    
    
    
    
    public Node<k>gettnode(int id){
    Node<k> p;
    p=L.getNext();
    int count=0;
    boolean t =true;
    while(t){
    if(p.getData().getStudent_Id()!=id){
    p=p.getNext();
    count++;
    }
    else
        t=false;
    }
        
    return p;
    
    }
    
    public void jump(int id){
    Node<k> p;
    p=L.getNext();
    int count=0;
    boolean t =true;
    while(t){
    if(p.getData().getStudent_Id()!=id){
    p=p.getNext();
    count++;
    }
    else
        t=false;
    }
        
    if(count>=0){
        System.out.println("List jump:"+count);
    }
    
    }
    
    public void clear()
    {
        L = new Node<>(null, null, null);
        R = new Node<>(L, null, null);
      L.setNext(R);
 
        theSize = 0;
    }
}
