package Zadanie4;

public class Horner {
    public static void main(String[] args)
    {
        double q[] = {1, 0, 1, -2, 0, -3};
        double w[] = {1, 0, 1, -2, 0, -3};
        int e = 5;
        int r = 11;
        double Wynik = 0;
        String Podziel = " x-11 ";
        String w2 = "  ";

        for(int i = 1 ; i <= e ; i++)
        {
            w[i] = w[i-1] * r + q[i];
            if(i == e)
            {
                Wynik = w[i];
            }
            if(e-i == 7)
            {
                w2 = w[i - 1] + "x^[" + (e - i)+ "]";
            }
            else
            {
                w2 = w[i - 1] + "x^[" + (e - i) + "] + " + w2;
            }
        }
        System.out.println();
        System.out.println(Wynik +  "/" +  Podziel + " + " + w2);
        System.out.println("Wartość wielomianu: " + Wynik);
    }
}