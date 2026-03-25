import java.util.Scanner;

public class Main {

    public static int validDateOfBirth(int currentYear, String dateOfbirth){
        int dob = Integer.parseInt(dateOfbirth);
        int minimumYear = currentYear - 125;

        if(dob < minimumYear || dob > currentYear){
            return  -1;
        }
        return  dob;
    }

    public class NumberToWords {
        // write code here
        public static int getDigitCount(int number){
            if(number < 0){
                return -1;
            }
            int count = 0;
            while(number > 0){
                number = number/ 10;
                count++;
            }
            return  count;
        }

        public static int reverse(int number){
            int reverse = 0;
            while(number != 0){
                int lnumber = number % 10;
                reverse = reverse * 10;
                reverse += lnumber;
                number = number/10;
            }
            return reverse;
        }

        public static void numberToWords(int number){

            if(number < 0){
                System.out.println("Invalid Value");
            }

            int reverse = reverse(number);
            int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);

            if(number == 0){
                System.out.println("Zero");
            }

            while(reverse != 0){
                int lastDigit = number % 10;

                switch(lastDigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid");
                        break;
                }
                reverse /= 10;


            }
            for (int i = 0; i < leadingZeroes; i++) {
                System.out.println("Zero");
            }

        }
    }

    public static int reverseNumber(int number){
        int reverse = 0;
        while( number > 0){
            int lnumber = number % 10;
            reverse = reverse * 10;
            reverse += lnumber;
            number = number / 10;
        }
        return reverse;
    }

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
//        printDivisor(25);
//        System.out.println(greatestCommonDivisor(100, 25));
//        System.out.println(digitCount(1));
//        System.out.println(reverseNumber(120));
//        System.out.println();
//
//        int number = 0;
//        while(number > 0){
//            int lastDigit = number % 10;
//
//            switch(lastDigit){
//                case 0:
//                    System.out.println("Zero");
//                    break;
//                case 1:
//                    System.out.println("One");
//                    break;
//                case 2:
//                    System.out.println("Two");
//                    break;
//                case 3:
//                    System.out.println("Three");
//                    break;
//                case 4:
//                    System.out.println("Four");
//                    break;
//                case 5:
//                    System.out.println("Five");
//                    break;
//                case 6:
//                    System.out.println("Six");
//                    break;
//                case 7:
//                    System.out.println("Seven");
//                    break;
//                case 8:
//                    System.out.println("Eight");
//                    break;
//                case 9:
//                    System.out.println("Nine");
//                    break;
//                default:
//                    System.out.println("Invalid");
//                    break;
//            }
//            number /= 10;
//
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hey, " + name + " how are you doing today?");
//        System.out.println("What year where you born? ");
//        boolean validDOB = false;
//        int age = 0;
//        do{
//            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + currentYear));
//        }

//        int actualAge = 2026 - Integer.parseInt(dob);
//        System.out.println("Great, you are " + actualAge + " years old");
//        Scanner scanner = new Scanner(System.in);
//        int count = 1;
//        double sum = 0;
//        while(count <= 5){
//            System.out.println("Enter number #" + count + ":");
//            String nextNumber = scanner.nextLine();
//            try {
//                double number1 = Double.parseDouble(nextNumber);
//                count++;
//                sum += number1;
//            }catch(NumberFormatException nfe){
//                System.out.println("Invalid number");
//            }
//        }
//        System.out.println("The sum of the 5 numbers = " + sum);
//
//        Scanner scanner = new Scanner(System.in);
//        double max = 0;
//        double min = 0;
//        int loopCount = 0;
//
//        while(true){
//        System.out.println("Enter a number or a character to quit: ");
//        String number1 = scanner.nextLine();
//        try {
//
//        }
//        catch(NumberFormatException nfe){
//
//        }
//        int count = 1;
//        int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//        while(count <= 5){
//            try {
//                System.out.println("Enter number #" + count + ":");
//
//                String num = scanner.nextLine();
//                int num1 = Integer.parseInt(num);
//
//                sum += num1;
//
//                count++;
//
//            }catch(NumberFormatException e){
//                System.out.println("Invalid number, enter a valid number");
//            }
//
//
//
//
//        }
//        System.out.println("Sum of number is: " + sum);
//
//        Scanner scanner1 = new Scanner(System.in);
//        int max = 0;
//        int min = 0;
//        boolean validNumber = false;
//        while(!validNumber){
//            System.out.println("Enter a valid number: ");
//            String num = scanner1.nextLine();
//            int num1 = Integer.parseInt(num);
//            min =+ num1;
//            if(num1 > min){
//                num1 = max;
//            }
//            System.out.println(min);
//            System.out.println(max);
//
//
//        }

        BankAccount acc1 = new BankAccount();
        acc1.setBalance(450000.00);
        acc1.depositFunds(34500);
//        acc1.withdraw(10000000.00);
        acc1.withdraw(40000);
        System.out.println(acc1.getBalance());


        SimpleCalculator calc1 = new SimpleCalculator();
        calc1.setFirstNumber(23);
        calc1.setSecondNumber(45);
        calc1.getAdditionResult();
        calc1.getMultiplicationResult();
        calc1.getDivisionResult();
        calc1.getMultiplicationResult();

    }
}