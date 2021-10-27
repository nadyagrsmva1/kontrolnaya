public class zad3 {
    public static void main(String[] args)
    {
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for(int i = 0; i < 12; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for(int i = 0; i < 12; i++)
        {
            System.out.print (mas[i]+" ");
        }
    }
}