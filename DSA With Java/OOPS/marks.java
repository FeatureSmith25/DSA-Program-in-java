public class marks {
    public static  class StudentData{
        String name;
        int rno;
        int size;
        int[] marks;
        StudentData(int[] s){
            marks=s;
        }
    }
    public static void main(String[] args) {
        int[] arr={4,7,1,4,8};
        StudentData s1=new StudentData(arr);
        s1.marks[0]=40;
        s1.marks[1]=50;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }   
}