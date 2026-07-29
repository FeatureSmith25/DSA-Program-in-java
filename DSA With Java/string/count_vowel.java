public class count_vowel {
    public static void main(String[] args) {
        int count=0;
        String s="my name is hardik sachan pursuing b.tech form kanppur institute of technology situated in rooma kanpur nagar";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') count++;
        }
        System.out.print(count);
    }    
}
