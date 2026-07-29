public class palindrome_string {
    public static void main(String[] args) {
        boolean status=false;
        String s="wow";
        int i=0, j=s.length()-1;
        while (i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                status=false;
                break;
            }
            else{
                status=true;
                i++;
                j--;
            }
        }
        System.out.println(status);
    }
}
 