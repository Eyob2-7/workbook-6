package com.pluralsight.streams;

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

        // Create a filtered list to store matches
        List<Person> filtered = new ArrayList<>();

        // Loop list to find matches
        for (Person p : people) {
            if (p.getFirstName().equalsIgnoreCase(searchName) || p.getLastName().equalsIgnoreCase(searchName)) {
                filtered.add(p); // add matching person to filtered list
            }
        }
        // Display matches or "no name found"
        if (filtered.isEmpty()) {
            System.out.println("no name found");
        } else {
            for (Person p : filtered) {
                System.out.println("Match found:" + p.getFirstName() + " " + p.getLastName());
            }
        }


        // calculate age
        int ageSum = 0;
        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;
        for (Person p : people) {
            int age = p.getAge();
            ageSum += age;

            if (age > oldest) {
                oldest = age;
            }
            if (age < youngest) {
                youngest = age;
            }
        }

        // Display results
        double averageAge = (double) ageSum / people.size();
        System.out.println("Total Age: " + ageSum);
        System.out.println("Average Age: " + averageAge);
        System.out.println("Oldest Age: " + oldest);
        System.out.println("Youngest Age: " + youngest);


    }


}
