class CountPerfectSquare{
    public static void main(String[] args) {
        int arr[] = {10,9,16,63,15,48,49,81,100,121,144,169};
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            double sqrt=Math.sqrt(arr[i]);
            if(sqrt*sqrt==arr[i]){
                System.out.println(arr[i]+" is a perfect square");
                count++;
        }
    }
    System.out.println("Total number of perfect Squares ="+count);
}
}