public class pokemon{
        int power;
        int defence;
        String type;
        pokem on(String t, int p){
            power = p;
            type = t;
        }
    }
public class revisionOOPS {
    public static void main(String[] args) {
        pokemon pikachu=new pokemon("Electric",70);
        pokemon jigglypuff=new pokemon("faury",50);
    }   
}
