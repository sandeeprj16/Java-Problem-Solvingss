import java.util.Scanner;
public class sumofno {

    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int s=sc.nextInt();
        // int sum=s*(s+1)/2;

        // System.out.println(sum);
        int sum=2;
        //int a=sc.nextInt();
        for (int a=1;a<=s;a++){
            sum+=a;
        }
        System.out.println(sum);
    }

}