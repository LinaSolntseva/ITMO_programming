/*
Лабораторная работа №1
Вариант 43278
Группа R3142 Солнцева Алина
 */


import java.lang.Math;


public class Lab_1 {
    public static void main(String[] args) {

        final short st = 4;
        final short fin = 22;
        short[] a = new short[(fin-st)/2+1];
        int ind = 0;
        for (short i = st; i <= fin; i+=2 ) {
            a[ind] = i;
            ind = ind + 1;
        }
        for (int i = 0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }

        System.out.println();

        double[] x = new double[19];
        for (int i = 0; i < x.length;i++){
            x[i] = ((int)(Math.random()*14)-2);
            System.out.print(x[i] + " ");
        }

        System.out.println();

        double[][] arr = new double[10][19];
        for (int i = 0; i < 10;i++){
            for (int j = 0; j < 19; j++){
                if (a[i]==4)
                    arr[i][j] = Math.cos(Math.pow(((Math.cbrt(x[j]))/1/3) , 3));
                else if (a[i] == 12 || a[i] == 14 || a[i] == 16 || a[i] == 18 || a[i] == 20)
                    arr[i][j] = Math.cbrt(Math.pow(((Math.atan(( x[j] + 4.5 )/ 13))/(0.5 + Math.pow((1/3*x[j]) , 3))) ,2));
                else
                    arr[i][j] = Math.asin(Math.pow((Math.pow((Math.pow(Math.E , -( Math.abs(x[j])))) , 2)) , 2));

            }
        }

        for ( int i = 0; i < 10; i++){
            for ( int j = 0; j < 19; j++){
                System.out.format("%.2f", arr[i][j] );
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}