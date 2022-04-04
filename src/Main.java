public class Main {
    public static void main(String[] args) {
        System.out.println(Main.factorial(5));
        System.out.println(Main.factorial(10));
    }

    public static int factorial(int num) {
        int result = 1;
        while (num >= 1) {
            result *= num;
            num--;
        }
        return result;
    }

}