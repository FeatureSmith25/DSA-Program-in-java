import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
public class add_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,4,5};
        int b[]={3,6,7,8,9};
        int c[]=new int[a.length+b.length];
        for(int ele:c) System.out.print(ele+" ");
        System.out.println();
        mergec(c,a,b);
        for(int ele:c) System.out.print(ele+" ");
        System.out.println();
    }
    public static void mergec(int[] c, int[] a, int[] b){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(j<b.length) c[k++]=b[j++];
        while(i<a.length) c[k++]=b[i++];
    }
}