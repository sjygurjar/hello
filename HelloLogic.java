public class HelloLogic {
    public static void main(String[] args) {
        int number = 7; // aap koi bhi number de sakte ho

        System.out.println("Hello Jenkins! Let's check a number...");
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}
