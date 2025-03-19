import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a no: ");
        int s=sc.nextInt();
        // long use for big integer
        long factorial=1;
        

        for (int i=1;i<=s;i++) {
            factorial*=i;

        }
        System.out.println("factorial no of " +s+" is:" +factorial);
    }
}
