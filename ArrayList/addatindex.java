// package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class addatindex {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(25);
        arr.add(28);
        arr.add(15);
        arr.add(23);
        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
