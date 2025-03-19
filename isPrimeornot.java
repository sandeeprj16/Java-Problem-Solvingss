import java.util.Scanner;

public class isPrimeornot {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no: ");
        int a=sc.nextInt();
        boolean isPrime=true;
        if (a<=1) {
            isPrime=false;

        }else {
            for(int i=2;i<a;i++){
                isPrime=false;
            }
        }
        System.out.println("is this prime no : "+ isPrime);
    }
}
