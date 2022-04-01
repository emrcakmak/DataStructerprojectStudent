
    public class Hash {

        private static final int DEFAULT_TABLE_SIZE = 10;

       private ListStudent<String>[] thelist;


       public Hash()
        {
            thelist = new ListStudent[DEFAULT_TABLE_SIZE];

            for(int i=0; i<thelist.length; i++)     
                thelist[i]=new ListStudent<>();

        }

       public void insert(StudentData x)
        {
            int deger =x.getStudent_Id();
            ListStudent<String> tu = thelist[myHash(deger)];

           if(!tu.varmı(deger)){
           tu.add(0, x);
           }

        }

        public void remove(StudentData x)
        {
             int deger =x.getStudent_Id();
           ListStudent<String> tu = thelist[myHash(deger)];

            if(tu.varmı(deger))       
                tu.remove(deger);        
        }

       public void printHashTable()
        {
            ListStudent<String> whichList;

            for(int i=0; i<thelist.length; i++)
            {
                whichList = thelist[i];

                System.out.print("|" + i + "|" + " --> ");            

                for(int j=0; j<whichList.size(); j++)                                                                  
                    System.out.print(whichList.get(j) + " --> ");     

                System.out.println();                                
            }
        }
       
       public void  jump(StudentData x ){
            ListStudent<String> tu = thelist[myHash(x.getStudent_Id())];
       tu.Hashvarmı(x.getStudent_Id());
    
      
       } 
    
        public boolean contains(StudentData x)
        {
     ListStudent<String> tu = thelist[myHash(x.getStudent_Id())];		
            return tu.varmı(x.getStudent_Id());    
        }

       private int myHash(Integer x)
        {
            return (x % thelist.length);    
        }

    }
