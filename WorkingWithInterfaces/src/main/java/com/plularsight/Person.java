package com.plularsight;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * Negative if the first value comes before the other
     * Zero if both values are equal
     * Positive if the first value comes after the other
     * */
    @Override
    public int compareTo(Person other) {

        int result;
        result =  this.firstName.compareToIgnoreCase(other.getFirstName());
        if(result != 0){
            return result;
        }
        result = this.lastName.compareToIgnoreCase(other.getLastName());
        if(result != 0){
            return result;
        }
        result = Integer.compare(this.age, other.age);
        return result;
    }
}
