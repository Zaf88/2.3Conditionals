public class Main {

    public static void main(String[] args) {

        // int age = 19;
        //  int salary = 85_000;
        //  int creditLimit = 0;
        // if (age >= 23) {
        //  System.out.println("creditLimit" + 3 * salary + "roubles");
        // } else
        //  System.out.println("creditLimit" + 2 * salary + "roubles");

        // if (salary >= 80_000) {
        //   System.out.println("creditLimit + increased + 1.5 times");
        // } else
        //   System.out.println("creditLimit + increased + 1.2 times");

        // {
        int age1 = 25;
        int term = 12;
        int salary1 = 56_000;
        int wantedSum = 330_000;

        if (age1 < 23) {
            System.out.println("interest 11%");
        } else
            System.out.println("interest 10.5%");
        if (salary1 > 80_000) {
            System.out.println("interest 9.3%");
        }
        int interest =wantedSum/100*10;
        int maxPayPerMonth = salary1 /100*50;
        System.out.println( "maxPayPerMonth" +  maxPayPerMonth);

        if (maxPayPerMonth > interest) {
            System.out.println("interest approved");
        }else
            System.out.println("interest disapproved");
        }
    }









