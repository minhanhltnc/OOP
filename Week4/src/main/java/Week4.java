import java.util.*;
import java.math.*;

public class Week4 {
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        if (b >= a) return b;
        return a;
    }

    public static int minArray(int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    public static String calculateBMI(double weight, double height) {
        double rawBMI = weight / (height * height);
        BigDecimal rounded = new BigDecimal(rawBMI).setScale(1, RoundingMode.HALF_UP);
        double bmi = rounded.doubleValue();

        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi <= 22.9) {
            return "Bình thường";
        } else if (bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
