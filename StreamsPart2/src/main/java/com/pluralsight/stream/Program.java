package com.pluralsight.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Create a list of people
        List<Person> people = new ArrayList<>();
        people.add(new Person("Dana", "Wyatt", 63));
        people.add(new Person("Zachary", "Westly", 31));
        people.add(new Person("Elisha", "Aslan", 14));
        people.add(new Person("Ian", "Auston", 16));
        people.add(new Person("Ian", "West", 16));
        people.add(new Person("Zephaniah", "Hughes", 9));
        people.add(new Person("Ezra", "Aiden", 17));
        people.add(new Person("Ezra", "Asteway", 27));
        people.add(new Person("Abebe", "Beso", 27));
        people.add(new Person("Israel", "Abebe", 27));

        // Ask user to enter a name to search (first or last)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name to search");
        String searchName = scanner.nextLine();

        // Step 1: Use Stream to filter names that match first or last name
        List<Person> filtered = people.stream()
                .filter(names -> names.getFirstName().equalsIgnoreCase(searchName) ||
                        names.getLastName().equalsIgnoreCase(searchName))
                .toList();
        if (filtered.isEmpty()) {
            System.out.println("No name found");
        } else {
            filtered.forEach(names -> System.out.println(names.getFirstName() + " " + names.getLastName()));
        }

        // Step2 : Calculate average age using streams
        double averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.println("Average Age: " + averageAge);

        // Step 3 : Find the oldest person using max()
        int oldest = people.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(0);
        System.out.println("Oldest Age: " + oldest);

        // Step 4 : Find the youngest person using min()
        int youngest = people.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(0);
        System.out.println("Youngest Age: " + youngest);

    }
}
