public class inverted_half_pyramid {
    public static void invertedhalfpyramid(int n){
        for(int i=5;i>=1;i--){
            int k=1;
            for(int j=0;j<i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedhalfpyramid(5);
    }
}