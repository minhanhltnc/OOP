import java.util.Scanner;

public class InversePermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        // read in permutation
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        // check if valid
        boolean[] exists = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (a[i] < 0 || a[i] >= n || exists[a[i]])//neu chưa doc gia tri thì van la false
                throw new RuntimeException("Input is not a permutation.");
            //sau khi doc xong thi chuyen thanh true de danh dau
            exists[a[i]] = true;
        }

        // invert
        int[] ainv = new int[n];
        for (int i = 0; i < n; i++)
            ainv[a[i]] = i;
        // vi du a[3]=1 thi ainv[1]=3


        // print out
        for (int i = 0; i < n; i++)
            System.out.print(ainv[i] + " ");
        System.out.println();
    }
}
