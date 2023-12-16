import java.util.*;

public class PhoneBook {
    private final HashMap<String, TreeSet<Integer>> phoneBook;

    public PhoneBook(){
        phoneBook = new HashMap<>();
    }

    public void add(String name, Integer phoneNum) {
        // computeIfAbsent - если значение с ключом name отсутствует, создает новую запись
        // с использованием лямбда-выражения k -> new TreeSet <>(), создающего новый TreeSet для хранения телефонов
        phoneBook.computeIfAbsent(name,k -> new TreeSet<>()).add(phoneNum);
    }

    public void showPhoneBook() {
        List<Map.Entry<String, TreeSet<Integer>>> entries = new ArrayList<>(phoneBook.entrySet());


        // Сортировка по убыванию числа телефонов
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));


        for (Map.Entry<String, TreeSet<Integer>> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
