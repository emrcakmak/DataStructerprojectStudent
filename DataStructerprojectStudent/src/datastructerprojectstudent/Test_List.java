
import java.util.Scanner;

public class Test_List {
    
    
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        Scanner nex =new Scanner (System.in);
          Scanner rt =new Scanner (System.in);
         Hash myHT = new Hash();
        ListStudent<String> kut = new ListStudent<>();
        Btree<String> kat =new  Btree<>();
        
        String ques ="\n0:exit\n"
                + "1:Add Student\n"
                + "2:Delete Student\n"
                + "3:Find Student\n"
                + "4:List All Student\n"
                + "5:List Distinct names\n"
                + "6:List Name count\n";
        
        while(true){
            System.out.println(ques);
            System.out.println("Select :");
             int seçim =input.nextInt();
             
             if(seçim==0){
             System.exit(seçim);
             }
             else if(seçim==1){
                 //please enter 0 first and other time enter with 1 added or 0
             System.out.println("position ");
               int idt =input.nextInt();
               
              System.out.println("id ");
               int id =input.nextInt();
               
                System.out.println("lastname ");
               String surname = nex.nextLine();
                input.nextLine();
               System.out.println("name ");
               String name =input.nextLine();
               StudentData  dts =new StudentData(id, name, surname);
          kut.add(idt,dts);
          kat.insertRecursively(dts);
          myHT.insert(dts);
          
             }
             else if(seçim==2)
             {
                  System.out.println("user id to be deleted");
               int id =input.nextInt();
                System.out.println("name of the person to be deleted ");
               String name =input.nextLine();
             input.nextLine();
                System.out.println("last name of the person to be deleted ");
               String surname = input.nextLine();
        
             StudentData silll =new StudentData(id, name, surname);
             kat.deleteRecursively(silll);
             kut.remove(id);
             myHT.remove(silll);
                 
             
             }
             else if(seçim==3)
             {
             System.out.println("id of the person to be found");
               int id =input.nextInt();
               StudentData varmıs =new StudentData(id, "ı", "p");
                 System.out.println("tree:"+kat.search(id)); 
                 System.out.println("list:"+kut.varmı(id));
                   System.out.println("hash:"+myHT.contains(varmıs));
                   
                   if(kut.varmı(id)==true){
                      kut.jump(id);
                 System.out.println( "tree:" + kat.jump(id));
                   myHT.jump(varmıs);
                   }
             if(kut.varmı(id)==true){
                 System.out.println( kut.gettnode(id).getData().getName());
                 System.out.println( kut.gettnode(id).getData().getSurName());
                 System.out.println( kut.gettnode(id).getData().getStudent_Id());
             }
              
               
               
             }
             else if(seçim==4)
             {
                 System.out.println("Select the data structure you want to list:list-tree-hash");
               String sevt =rt.nextLine();
               switch(sevt){
                   case "list":
               System.out.println("Linked List : " +  kut.İD());
               break;
                   case "tree":
                       
                       System.out.print("Tree ınorder:");
              kat.printInorder();
              System.out.print("Tree preorder:");
              kat.printPreorder();
              System.out.print("Tree postorder:");
              kat.printPostorder();
                       System.out.println(" ");
              break;
              case "hash":
                  System.out.println(" ");
               System.out.println("hash");
              System.out.println("****************************");
              myHT.printHashTable(); 
              break;
              
              default:
                  System.out.println("invalid choice");
               }
             
             }
             else if(seçim==5)
             {
              kut.Dis();
             }
             else if(seçim==6)
             {
             kut.Dub();
             }
            
        
        
        }
        
    }
    
}
