import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Equation {
    public static String getSolution(String str) {
        // Введите свое решение ниже
        String result = "";
        int q = 0, b = 0;

//        String[] partstr = str.split("/s*[+=]/s*");
        String[] partstr = str.split(" ");
        if (partstr[0].contains("?")) {
            q = Integer.parseInt(partstr[2]);
        }
        if (partstr[2].contains("?")) {
            q = Integer.parseInt(partstr[0]);
        }

//        for (int i = 0; i < partstr.length; i++) {
//            System.out.println(partstr[i]);
//        }
        b = Integer.parseInt(partstr[partstr.length-1]);
        System.out.println(q);
        System.out.println(b);

        int npos = b - q;
        result = "Given the equation: " + str + "\nResult: " + str.replace("?",Integer.toString(npos));


        return result;

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
        String fille = "";
        String name = "input.txt";

        try {
            Scanner sc = new Scanner(new File("D:\\GeakBrains\\JavaStart\\HomeWork\\HW1\\src\\" + name));
            while (sc.hasNextLine())
            {
                fille = sc.nextLine();
            }
            sc.close();

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        Equation eq = new Equation();
        String result = eq.getSolution(fille);
        System.out.println(result);
    }
}
