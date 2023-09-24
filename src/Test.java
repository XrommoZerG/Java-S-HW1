import javax.swing.text.html.parser.Parser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static String getSolution(String str) {
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


    public static void main(String[] args) {
//        File file1 = new File("input.txt");
//        String str = file1.;
//        System.out.println(str);
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
        String str = "2 + ? = 69";

        //System.out.println(fille);
        String res = getSolution(fille);
        System.out.println(res);

    }
}
