package main.java.lesson1;

public class Task1 {


    public static void main(String[] args) {


    }

    public static int min(int a, int b, int c) {

        int m;
        if (a < b && a < c)  m=a;
        else if (b < a && b < c)  m=b;
        else  m=c;
        return m;
    }
}
