
public class StudentData {
    
     private int Student_Id;
    private String Name;
    private String SurName;

    
    public StudentData(int Student_Id, String Name, String SurName) {
        this.Student_Id = Student_Id;
        this.Name = Name;
        this.SurName = SurName;
    }

    
    public int getStudent_Id() {
        return Student_Id;
    }

    
    public void setStudent_Id(int Student_Id) {
        this.Student_Id = Student_Id;
    }

    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    
    public String getSurName() {
        return SurName;
    }

   
    public void setSurName(String SurName) {
        this.SurName = SurName;
    }
}
