import java.util.Scanner;

public class PronounceNumber {
    public static void main(String[] args) {
        int number ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        number = scanner.nextInt();

        if (number < 10){
            switch (number){
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
        }
        if (number >= 10 && number < 20){
            int a = number % 10;
            switch (a){
                case 0:
                    System.out.print("Ten");
                    break;
                case 1:
                    System.out.print("Eleven");
                    break;
                case 2:
                    System.out.print("Twelve");
                    break;
                case 3:
                    System.out.print("Thirteen");
                    break;
                case 4:
                    System.out.print("Fourteen");
                    break;
                case 5:
                    System.out.print("Fifteen");
                    break;
                case 6:
                    System.out.print("Sixteen");
                    break;
                case 7:
                    System.out.print("Seventeen");
                    break;
                case 8:
                    System.out.print("Eighteen");
                    break;
                case 9:
                    System.out.print("Nineteen");
                    break;
            }
        }
        if (number >=20 && number < 100){
            int a = number / 10;
            double b = Math.floor(a);
            switch ((int) b){
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Fourty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            int c = number % 10;
            switch (c){
                case 1:
                    System.out.print(" one");
                    break;
                case 2:
                    System.out.print(" two");
                    break;
                case 3:
                    System.out.print(" three");
                    break;
                case 4:
                    System.out.print(" four");
                    break;
                case 5:
                    System.out.print(" five");
                    break;
                case 6:
                    System.out.print(" six");
                    break;
                case 7:
                    System.out.print(" six");
                    break;
                case 8:
                    System.out.print(" eight");
                    break;
                case 9:
                    System.out.print(" nine");
                    break;
            }
        }
        if (number >= 100 && number < 1000){
            int a = number / 100;
            double b = Math.floor(a);
            switch ((int) b){
                case 1:
                    if (number != 100){
                        System.out.print("One hundred and ");
                    } else System.out.print("One hundred ");
                    break;
                case 2:
                    if (number != 200){
                        System.out.print("Two hundred and ");
                    } else System.out.print("Two hundred ");
                    break;
                case 3:
                    if (number != 300){
                        System.out.print("Three hundred and ");
                    } else System.out.print("Three hundred ");
                    break;
                case 4:
                    if (number != 400){
                        System.out.print("Four hundred and ");
                    } else System.out.print("Four hundred ");
                    break;
                case 5:
                    if (number != 500){
                        System.out.print("Five hundred and ");
                    } else System.out.print("Five hundred ");
                    break;
                case 6:
                    if (number != 600){
                        System.out.print("Six hundred and ");
                    } else System.out.print("Six hundred ");
                    break;
                case 7:
                    if (number != 700){
                        System.out.print("Seven hundred and ");
                    } else System.out.print("Seven hundred ");
                    break;
                case 8:
                    if (number != 800){
                        System.out.print("Eight hundred and ");
                    } else System.out.print("Eight hundred ");
                    break;
                case 9:
                    if (number != 900){
                        System.out.print("Nine hundred and ");
                    } else System.out.print("Nine hundred ");
                    break;
            }
            int c = number / 10;
            double d = Math.floor(c);
            double e = d % 10;
            switch ((int) e){
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("fourty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
            int f = number % 100;
            int v = f % 10;
            switch (v){
                case 0:
                    if (e == 1){
                        System.out.print("ten");
                    } else System.out.print("");
                    break;
                case 1:
                    if (e == 1){
                        System.out.print("eleven");
                    } else System.out.print("one");
                    break;
                case 2:
                    if (e == 1){
                        System.out.print("twelve");
                    } else System.out.print("two");
                    break;
                case 3:
                    if (e == 1){
                        System.out.print("thirteen");
                    } else System.out.print("three");
                    break;
                case 4:
                    if (e == 1){
                        System.out.print("fourteen");
                    } else System.out.print("four");
                    break;
                case 5:
                    if (e == 1){
                        System.out.print("fifteen");
                    } else System.out.print("five");
                    break;
                case 6:
                    if (e == 1){
                        System.out.print("sixteen");
                    } else System.out.print("six");
                    break;
                case 7:
                    if (e == 1){
                        System.out.print("seventeen");
                    } else System.out.print("seven");
                    break;
                case 8:
                    if (e == 1){
                        System.out.print("eighteen");
                    } else System.out.print("eight");
                    break;
                case 9:
                    if (e == 1){
                        System.out.print("nineteen");
                    } else System.out.print("nine");
                    break;
            }
        }
    }
}
