public class zad1 {
    public static void main(String[] args) {
        System.out.println(doMath(5, 8));
    }
    static boolean doMath(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
}