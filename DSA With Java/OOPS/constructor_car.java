public class constructor_car{
    public static class car{
        String name;
        int price;
        car(){

        }
        car(String s, int x){
            name=s;
            price=x;
        }
        car(int x, String s){
            name=s;
            price=x;
        }
        void  print(){
            System.out.println(price+" "+name);
        }
    }
    public static void main(String[] args) {
        car c1=new car(1900000,"Mahindra Thar");
        c1.print();
        car c2=new car("TATA Siera",1200000);
        c2.print();
    }
}
