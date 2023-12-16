
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введит количество записей");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Введите имя и телефон через пробел:");
            String name = scanner.next();
            int phoneNum = scanner.nextInt();
            phoneBook.add(name, phoneNum);
        }

        System.out.println("Телефонная книга:");
        phoneBook.showPhoneBook();

    }
}