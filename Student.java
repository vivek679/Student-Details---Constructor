public class Student{
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;
    public Student(int studentId,String studentName,String studentAddress){  // Shiva - added public here
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.collegeName="NIT";
    }
    public Student(int studentId,String studentName,String studentAddress,String collegeName){ // shiva - added public here
        this(studentId,studentName,studentAddress);
        this.collegeName=collegeName;
    }
  
    public int getStudentId(){        return studentId;    }
    public String getStudentName(){        return studentName;    }
    public String getStudentAddress(){        return studentAddress;    }
    
    public String getCollegeName(){
        return collegeName;
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setStudentAddress(String studentAddress){
        this.studentAddress=studentAddress;
    }
    public void setCollegeName(String collegeName){
        this.collegeName=collegeName;
    } 
}
