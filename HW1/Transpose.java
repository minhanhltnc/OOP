import java.util.*;
//đề bài, yêu cầu nhập vào số nguyên n, tạo mảng  2 chiều nxn phần tử
//chuyển vị ma trận, in ma trận trc và sau chuyển vị
public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[][]a;//khai bao mang 2 chieu
        a=new int[n][n];//cap phat mang
        //ham tao mang
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=(int)(Math.random()*101);//gan gia tri ngau nhien
                //ham random lay tu 0 den <1,nhan voi 101 de lay tu 0 den100
            }
        }
        //ham in mang
        System.out.println("Before");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //System.out.print(a[i][j]+" ");
                System.out.printf("%3d",a[i][j]);
            }
            System.out.print('\n');
        }
        //chuyen vi
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                //chi duyet phan tren duong cheo chinh
                //neu khong se swap 2 lan
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;


            }
        }
        //
        System.out.println("After");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //System.out.print(a[i][j]+" ");
                System.out.printf("%3d",a[i][j]);
            }
            System.out.print('\n');
        }

    }
}
