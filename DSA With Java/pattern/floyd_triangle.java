public class floyd_triangle {
    public static void floydtriangle(int n){
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k+"   ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydtriangle(5);
    }
} 