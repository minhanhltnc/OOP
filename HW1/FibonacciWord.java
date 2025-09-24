import java.util.Scanner;

public class FibonacciWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String f0="a";
        String f1="b";
        String fx="";
        if(n==0)fx=f0;
        if(n==1)fx=f1;
        for(int i=2;i<=n;i++){
            fx=f1+f0;
            f0=f1;
            f1=fx;
        }
        System.out.println(fx);


    }
}
