package Zadanie1;

import java.util.function.DoubleFunction;

public class MetodaStycznych {
    private static final double DX = 0.001;
    private static DoubleFunction<Double> derive(DoubleFunction<Double> f) {
        return (x) -> (f.apply(x + DX) - f.apply(x)) / DX;
    }
    public static void main(String[] args) {
        DoubleFunction<Double> funkcyjka = (x) ->  Math.pow(x,3)+x-1;
        double x0,x1,f0,f1;
        x0 = -0;
        double E = 0.001;
        x1 = x0 - f(x0)/ derive(funkcyjka).apply(x0);
        f0 = f(x0);
        while(Math.abs(x1-x0) > E && Math.abs(f0) > E){
            f1 = derive(funkcyjka).apply(x0);
            if(Math.abs(f1) < E){
                System.out.print("ERROR niestety");
                break;
            }
            x1 = x0;
            x0 = x0 - f0 / f1;
            f0 = f(x0);
        }
        if(x0==0){
            System.out.print(" Nie spełnia ");
        }
        System.out.print("x = " + x0);
    }

    public static double f(double x){
        return Math.pow(x,3)+x-1;
    }
}

