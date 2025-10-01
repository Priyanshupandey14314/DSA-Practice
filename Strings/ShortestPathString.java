public class ShortestPathString {
    public static float getShortPath(String directions){
        int x=0,y=0;
        for(int i=0;i<directions.length();i++){
            char dir = directions.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='W'){
                x--;
            }
            else{
                x++;
            }
            
        }
        int sqrx = x*x,sqry = y*y;
        return (float)Math.sqrt(sqrx+sqry);
    }
    public static void main(String[] args) {
        String directions = "WNEENESENNN";
        System.out.println("Shortest path is: "+getShortPath(directions));
    }
}
