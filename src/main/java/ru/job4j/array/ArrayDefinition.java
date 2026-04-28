package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Pitr";
        names[1] = "Ivan";
        names[2] = "Pavel";
        names[3] = "Sidorov";
        System.out.println("Размер массива ages: " + names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }
}