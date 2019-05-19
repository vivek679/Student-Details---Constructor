import java.util.Scanner;
public class StudentMain{
    public static void main(String[] args){
    boolean flag=true;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int studentId=sc.nextInt();
        System.out.println("Enter Student's Name:");
        String _studentName=sc.nextLine();
        String studentName=sc.nextLine();
        System.out.println("Enter Student's address:");
        String studentAddress=sc.nextLine();

        do{
            System.out.println("Whether the student is from NIT(Yes/No):");
            String str1=sc.nextLine();
             if (str1.equals("no") || str1.equals("NO") ) {
                System.out.println("Enter the college name:");
                String collegeName = sc.nextLine();
                Student student = new Student(studentId,studentName,studentAddress,collegeName);
                
                System.out.println("Student id:"+student.getStudentId());
                System.out.println("Student name:"+student.getStudentName());
                System.out.println("Address:"+student.getStudentAddress());
                System.out.println("College name:"+student.getCollegeName());
                flag=false;
                 
             }
            else if(str1.equals("yes") || str1.equals("YES") ){
                Student student = new Student(studentId,studentName,studentAddress);
                student.setCollegeName("NIT");
                System.out.println("Student id:"+student.getStudentId());
                System.out.println("Student name:"+student.getStudentName());
                System.out.println("Address:"+student.getStudentAddress());
                System.out.println("College name:"+student.getCollegeName());
                flag=false;
            }
            else {
                System.out.println("Wrong Input");
                flag=true;
            }
        }while(flag);

    }
}
