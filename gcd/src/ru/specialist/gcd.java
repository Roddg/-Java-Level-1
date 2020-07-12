package ru.specialist;

public class gcd {

    public static void main(String[] args) {
        System.out.println(gcd(-462, 1071));
        System.out.println(gcd2(-462, 1071));
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }


    public static int gcd2(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }


}
