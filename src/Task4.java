import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Equation {
    public static String getSolution(String str) {
        // Введите свое решение ниже
        String[] strarr = str.split(" ");
        int result;
        int a = 0;
        int b = 0;
        if (strarr[0] == "?") {
            a = (int)Integer.parseInt(strarr[2]);
            b = Integer.parseInt(strarr[4]);
            System.out.println("jkjkj");

        }
        else if (strarr[2] == "?") {
            a = Integer.parseInt(strarr[0]);
            b = Integer.parseInt(strarr[4]);
            System.out.println("as");

        }
        result = b - a;
        System.out.println(b);

        System.out.println(a);

        System.out.println(result);
        char c = (char) result;
        String strresult = str.replace('?',c);
        return strresult;

    }
}

public class Task4 {
    public static void main(String[] args) {
        String file = "";

        if (args.length == 0) {
            file = "input.txt";
        } else {
            file = args[0];
        }
        file = "2 + ? = 69";

        Equation eq = new Equation();
        String result = eq.getSolution(file);
        System.out.println(result);
    }
}
