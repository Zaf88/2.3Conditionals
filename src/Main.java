public class Main {

    public static void main(String[] args) {

        int age = 19;
        int salary = 85_000;
        int creditLimit = 0;
        if (age >= 23) {
            System.out.println("creditLimit" + 3 * salary + "roubles");
        } else
            System.out.println("creditLimit" + 2 * salary + "roubles");

        if (salary >= 80_000) {
            System.out.println("creditLimit + increased + 1.5 times");
        } else
            System.out.println("creditLimit + increased + 1.2 times");}}

