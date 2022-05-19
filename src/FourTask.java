import java.util.Scanner;

public class FourTask {
    public static void main(String[] args) {
        String program = ""; // ЧИСЛА, ЯКІ ЗАГАДАЛА ПРОГРАМА
        String userInput = ""; // ЧИСЛА ЯКІ ВВОДИТИМЕ КОРИСТУВАЧ
        int attempt = 0; // СПРОБИ
        for (int i = 0; i < 3; i++) {
            program = program.concat(String.valueOf((int)(Math.random()*3) + 1)); // пробував з масивом, не вийшло, роблю зі String
        }
        //System.out.println(program);

        Scanner sc = new Scanner(System.in);
        System.out.println("Програма загадала послідовність з трьох чисел, у вас лише дві спроби. Удачі!!!");
        System.out.println("Введіть послідовність трьох чисел з проміжку [1; 3]: ");
        for (; attempt < 2; attempt++) {
            if (sc.hasNext()) {
                userInput = sc.next();
                if (userInput.equals(program)) {
                    System.out.println("Ура!!! Ви вгадали!!!!");
                    break;
                } else {
                    System.out.println("Ви не вгадали(((");
                }
            } else {
                System.out.println("Ви ввели щось не то((((");
            }


        }




    }
}
