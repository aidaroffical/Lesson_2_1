public class Main {
    public static void main(String[] args) {

        System.out.printf(home(22, 38));
        System.out.printf(home(12, 53));
        System.out.printf(home(15, 43));
        System.out.println(home(10, 99));
        System.out.println(home(5, 73));
    }

    public static String home(int age, int temperature) {

        String home1 = "Можно идти гулять";
        String home2 = ("Оставайтесь дома");

        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 35) {
            return home1;
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return home1;
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return home1;
        } else {
            return home2;


        }
    }
}


