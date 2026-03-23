public class Main {

    public static int digitCount(int number){
        int count = 0;
        while(number > 0){
            number = number/ 10;
            count++;
        }
        return  count;
    }

    public static int greatestCommonDivisor(int num1, int num2){
        if(num1 < 10 || num2 < 10){
            return  -1;
        }
        int smallestNumber = num1 > num2 ? num1 : num2;
        int gcd = 1;
        for(int i = 1; i <= smallestNumber; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void printDivisor(int number){
        for(int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }


        }
    }
    public static void main(String[] args) {
        printDivisor(25);
        System.out.println(greatestCommonDivisor(100, 25));
        System.out.println(digitCount(1));

    }
}