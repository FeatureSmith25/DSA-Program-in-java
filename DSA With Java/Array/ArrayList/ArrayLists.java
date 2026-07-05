import java.util.ArrayList;
import java.util.Collections;
class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        // add element
        list.add(0);
        list.add(2);
        list.add(5);
        System.out.println(list);
        // get element
        // get methode it is used to find a spacific element whit the help of index number like given belwo
        int element =list.get(0);
        System.out.println(element );

        // add element in arraylist kisi bhi space pe to hum add() method ke duvara hum sabase phale usme index denge fir element like 
        list.add(1,23);
        System.out.println(list);

        // set mathod
        list.set(1,50);
        System.out.println(list);


        // delet element 
        list.remove(0);
        System.out.println(list);

        // size of list
        int size=list.size();
        System.out.println(size);


        // loop
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);


    }
    
}
