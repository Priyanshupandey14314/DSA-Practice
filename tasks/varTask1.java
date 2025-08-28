import java.util.*;
class varTask1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int avg = (first + second + third)/3;
        System.out.println("Average of three numbers is: " + avg);
    }
}