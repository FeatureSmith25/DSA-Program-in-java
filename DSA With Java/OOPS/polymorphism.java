public class polymorphism {
    public static class Dog {
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Cat {
        void speak(){
            System.out.println("Meaw Meaw");
        }
    }
    public static class Lion {
        void speak(){
            System.out.println("RRRRRRRRRRR");
        }
    }
    public static class Human {
        void speak(){
            System.out.println("Hello");
        }
    }
    public static class pikachu {
        void speak(){
            System.out.println("Pikachu");
        }
    }
    public static void main(String[] args) {
        Human h=new Human();
        pikachu p=new pikachu();
        Dog d= new Dog();
        Cat c=new Cat();
        c.speak();
        d.speak();
        h.speak();
        p.speak();
    }
}