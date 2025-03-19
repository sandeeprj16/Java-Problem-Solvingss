import java.util.Scanner;

public class evenoddno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s =sc.nextInt();
    // for even no
    System.out.println("even no : ");
        for (int a=2;a<=s;a=a+2) {
           System.out.print(a+" ");
        }
        System.out.println();

    System.out.println("odd no : ");
        for (int b=1;b<=s;b+=2) {
            System.out.print(b+" ");
        }
       
        
    }
}
