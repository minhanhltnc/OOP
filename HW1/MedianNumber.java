import java.util.Scanner;

// đề bài: viêt chương trình tìm trung vị dãy 5 số, ko dùng quá 6 phép

/**Với 5 phần tử, có 5!=120 cách hoán vị.
 *Cây quyết định nhị phân (decision tree) với chiều caoh phân biệt tối đa 2^h trường hợp.
 * 2^h>=120=>h>=7
 */
public class MedianNumber {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int a[]={5,67,48,44,3};
        int max1=a[0];
        int min1=a[1];
        if(a[1]>max1){max1=a[1];min1=a[0];}//ss1
        int max2=a[2];
        int min2=a[3];
        if(a[3]>max2){max2=a[2];min2=a[3];}//ss2
        int max = (max1 > max2) ? max1 : max2; // So sánh để lấy phần tử lớn nhất -ss3
        int min = (min1 < min2) ? min1 : min2; // So sánh để lấy phần tử nhỏ nhất-ss4
        //tao mang moi de xet 3 phan tu con lai
        int[] candidates = new int[3];
        int idx = 0;
        for (int i = 0; i < 5; i++) {
            if (a[i] != max && a[i] != min) {
                candidates[idx++] = a[i];
            }
        }
        int x = candidates[0];
        int y = candidates[1];
        int z = candidates[2];
        int median;

        if (z < x) median = x;        // ss5
        else if (z > y) median = y;   // ss6
        else median = z;


        System.out.println("Median is: " + median);




    }
}
