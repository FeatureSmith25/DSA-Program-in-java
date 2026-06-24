public class minimumoutofmaximumofrows {
    public static void main(String[] args) {
        int[][] arr={{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int maxEle=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int greater=0;
            for(int j:arr[i]){
                greater=Math.max(greater,j);
            }
            maxEle=Math.max(maxEle, greater);
        }
        System.out.print(maxEle);
    }    
}
