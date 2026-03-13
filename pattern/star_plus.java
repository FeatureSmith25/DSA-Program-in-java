public class star_plus {
    public static  void star_plus(int row, int col){
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==row/2||j==col/2)
                {
                    System.out.print("* ");
                }    
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        star_plus(5,5);
    }   
}