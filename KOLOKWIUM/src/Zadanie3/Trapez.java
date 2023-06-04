package Zadanie3;

public class  Trapez {
    private static double funkcja(double x)
    {
        double e = Math.exp(2);
        double kwadrat = x*x;
        return Math.pow(e,kwadrat);
    }

    public static void main(String[] args)
    {
        double ap=-1, ak=0, h, calka=0;
        int n=25;
        h = (ak - ap) / (double)n;
        calka = 0;
        for (int i=1; i<n; i++) {
            calka += funkcja(ap + i *h);
        }
        calka += (funkcja(ap) + funkcja(ak)) / 2;
        calka *= h;

        System.out.println(calka);

    }

}