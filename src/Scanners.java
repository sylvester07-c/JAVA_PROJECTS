import java.util.Scanner;

public class Scanners {

        // write code here
        public static void inputThenPrintSumAndAverage(){
            int sum = 0;
            int avg = 0;
            int count = 0;
            Scanner scanner = new Scanner(System.in);


            try{

                while(true){
                    System.out.println("Enter a number: ");
                    String number = scanner.nextLine();
                    int value = Integer.parseInt(number);
                    sum += value;
                    count++;
                    avg = sum/count;

                }

            }catch(NumberFormatException nfe){
                System.out.println("SUM = " + sum + " AVG = " + avg);
            }
        }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    }

