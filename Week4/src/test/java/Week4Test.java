import org.junit.Assert;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        Assert.assertEquals(5, Week4.max2Int(3, 5));
    }

    @Test
    public void testMax2Int2() {
        Assert.assertEquals(6, Week4.max2Int(6, 5));
    }

    @Test
    public void testMax2Int3() {
        Assert.assertEquals(7, Week4.max2Int(5, 7));
    }

    @Test
    public void testMax2Int4() {
        Assert.assertEquals(6, Week4.max2Int(0, 6));
    }

    @Test
    public void testMax2Int5() {
        Assert.assertEquals(800, Week4.max2Int(100, 800));
    }

    @Test
    public void testMinArray1() {
        Assert.assertEquals(1, Week4.minArray(new int[]{1, 2, 3}));
    }

    @Test
    public void testMinArray2() {
        Assert.assertEquals(-5, Week4.minArray(new int[]{0, -5, 10}));
    }

    @Test
    public void testMinArray3() {
        Assert.assertEquals(3, Week4.minArray(new int[]{3, 3, 3}));
    }

    @Test
    public void testMinArray4() {
        Assert.assertEquals(0, Week4.minArray(new int[]{100, 50, 0}));
    }

    @Test
    public void testMinArray5() {
        Assert.assertEquals(-100, Week4.minArray(new int[]{-100, -50, -75}));
    }


    @Test
    public void testCalculateBMI1() {
        Assert.assertEquals("Thiếu cân", Week4.calculateBMI(45, 1.65));
    }

    @Test
    public void testCalculateBMI2() {
        Assert.assertEquals("Bình thường", Week4.calculateBMI(60, 1.65));
    }

    @Test
    public void testCalculateBMI3() {
        Assert.assertEquals("Thừa cân", Week4.calculateBMI(67, 1.65));
    }

    @Test
    public void testCalculateBMI4() {
        Assert.assertEquals("Béo phì", Week4.calculateBMI(77, 1.65));
    }

    @Test
    public void testCalculateBMI5() {
        Assert.assertEquals("Béo phì", Week4.calculateBMI(85, 1.65));
    }
} 