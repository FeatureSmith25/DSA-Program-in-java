import java.util.ArrayList;
import java.util.Arrays;

public class union_of_sorted_array {
    public static void main(String[] args) {
        int[] a={3,4,2,2,4};
        int[] b={3,2,2,7};
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        ArrayList<Integer>ans=new ArrayList<>();
        while(i<a.length||j<b.length){

            if(a[i]<=
                b[j]){
                ans.add(a[i]);
                i++;
            }
            else{
                ans.add(b[j]);
                j++;
            }
        }
        System.out.print(ans);
    }
}
