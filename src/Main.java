import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 36;
        String name = "Andrey";

        double numberOne = 17.6;
        double numberTwo = 15.2;

        System.out.println("My name is" + name + ". My age is " + age + " years old.");
        System.out.println("The sum of two numbers = " + numberOne + numberTwo);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String nameUser = scanner.nextLine();
        System.out.println("Введите возраст: ");
        int ageUser = scanner.nextInt();
        System.out.println("Тебя зовут " + name + " и ты ");
        if (ageUser > 0 && ageUser < 18) {
            System.out.print(" подросток.");
        } else if (ageUser >= 18 && ageUser < 60) {
            System.out.println(" взрослый.");
        } else if (ageUser >= 60 && ageUser < 125) {
            System.out.println(" пожилой.");
        } else System.out.println(" не существуешь!");

        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            if (password.equals("admin123")) {
                System.out.println("Доступ разрешен!");
            } else System.out.println("Ошибка доступа!");
        }
        System.out.println("Доступ запрещен!");
    }
}