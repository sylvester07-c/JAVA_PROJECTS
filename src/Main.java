public class Main {
    public static void printDivisor(int number){
        for(int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }


        }
    }
    public static void main(String[] args) {
        printDivisor(25);

    }
}