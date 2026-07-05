public class pssing_classes_to_method {
    public static class Car{
        double length;
        int seats;
        String name;
        String type;
        int torque;
        void print(){
        System.out.println(seats+" "+name+" "+length+" "+type+" "+torque+"nm ");
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.length=3.99;
        c.name = "KIA Sonet";
        c.seats=5;
        c.torque=178;
        c.type="SUV";

        change(c);
        System.out.println(c.seats);
        c.print();
    }   
    public static void change(Car c){
        c.seats=7;
    }
}