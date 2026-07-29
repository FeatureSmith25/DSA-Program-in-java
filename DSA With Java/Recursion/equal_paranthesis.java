import java.util.ArrayList;
import java.util.List;

public class equal_paranthesis {
    public static void parenthesis(int n, int l, int r, String s, List<String> ans){
        if(r==n){
            ans.add(s);
            System.out.println(ans);
        }
        if(l<n) parenthesis(n, l+1, r, s+"(", ans);
        if(r<l) parenthesis(n, l, r+1, s+")", ans);
    }
    public static void main(String[] args) {
        int n=3;
        List<String>ans=new ArrayList<>();
        parenthesis(n,0,0,"",ans);
    }   
}