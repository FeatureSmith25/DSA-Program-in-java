public class userdefinedatatype {
    public static class Student{
        String name;
        int rno;
        double cgpa;
        void print(){
        System.out.println(name+" "+rno+" "+cgpa);
        }
    }   
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name = "Aditya";
        s1.rno = 17;
        s1.cgpa = 8.3;

        Student s2=new Student();
        s2.name = "Aman";
        s2.rno = 26;
        s2.cgpa = 8.9;

        Student s3=new Student();
        s3.name = "Abhay";
        s3.rno = 05;
        s3.cgpa = 8.2;
        s1.print(); 
        s2.print(); 
        s3.print(); 
    }
}