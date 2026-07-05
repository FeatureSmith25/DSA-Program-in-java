import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class commaon_elel {
    public static void main(String[] args) {
        int[] a={3,4,2,2,4};
        int[] b={3,2,2,7};
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        ArrayList<Integer>ans=new ArrayList<>();
        while(i<a.length&&j<b.length){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]) i++;
            else j++;
        }
        System.out.print(ans);
    }
}
