public class SearchInSortedMatrix {
    public static boolean searchSorted(int mat[][],int key){
        int row =0;
        int col = mat[0].length-1;
        while(row<mat.length && col>=0){
            if(mat[row][col]==key){
                System.out.println("Found at :"+row+","+col);
                return true;
            }
            else if(key<mat[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.err.println("Not found");
        return false;
    }
    public static void main(String[] args) {
        int mat[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        searchSorted(mat, 33);
    }
}
