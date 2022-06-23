public class Main {

    public static void main(String[] args) {

        int age = 19;
        int salary = 59_000;
        if (age >= 23) {
            System.out.println("We are ready to issue you a credit card with a limit" + 3 * salary + "roubles");
        }  if (salary >= 80_000) {
            System.out.println("creditLimit + increased + 1.5 times");
        }
        if (age < 23) {
            System.out.println("We are ready to issue you a credit card with a limit" + 2 * salary + "roubles");
        }
         else if (salary >= 50_000) {
            System.out.println("creditLimit + increased + 1.2 times");
        }
    }
}

