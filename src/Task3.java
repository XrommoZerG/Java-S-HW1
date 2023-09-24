class Calculator {
    public int calculate(char op, int a, int b) {
        // Введите свое решение ниже

        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return 1;

    }
}

public class Task3 {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
        Calculator calculator = new Calculator();
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            if (b == 0 && op == '/') {
                System.out.println("Некорректный оператор: 'оператор'");
            } else {
                int result = calculator.calculate(op, a, b);
                System.out.println(result);
            }
        } else {
            System.out.println("Некорректный оператор: 'оператор'");
        }
    }
}
