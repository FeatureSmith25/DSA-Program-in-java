// package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class listreverse {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(25);
        arr.add(28);
        arr.add(15);
        arr.add(23);
        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
        int i=0, j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
