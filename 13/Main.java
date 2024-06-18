import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в англо-белорусский словарь!");
        System.out.println("Введите «1», чтобы добавить новый перевод");
        System.out.println("Введите «2», чтобы получить перевод английского слова");
        System.out.println("Введите «0», чтобы выйти");

        while (true) {
            System.out.print("Введите свой выбор:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            if (choice == 1) {
                System.out.print("Введите английское слово: ");
                String englishWord = scanner.nextLine();
                System.out.print("Введите белорусское слово: ");
                String belarusianWord = scanner.nextLine();
                DictionaryModifier.addTranslation(englishWord, belarusianWord);
            } else if (choice == 2) {
                System.out.print("Введите английское слово, чтобы получить перевод:");
                String englishWord = scanner.nextLine();
                DictionaryQuery.getTranslations(englishWord);
            } else if (choice == 0) {
                System.out.println("Выход из программы. До свидания!");
                break;
            } else {
                System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.");
            }
        }
        scanner.close();
    }
}