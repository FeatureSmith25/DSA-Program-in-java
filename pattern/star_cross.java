public class star_cross {
    public static  void star_cross(int row, int col){
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==j||j==row-i-1)
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
        star_cross(7,7);
    }
}
