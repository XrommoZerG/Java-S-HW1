class Answer {
    public int countNTriangle(int n) {
        // Введите свое решение ниже
        int ansver = (n * (n + 1)) / 2;
        return ansver;

    }
}


public class Task1 {

    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 4;
        } else {
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }

}
