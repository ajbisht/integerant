import java.util.Scanner;

public class Integertowords  {
        public static void main(String[] args) {
            int number = 1;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please type a number between 1 and 2 billion OR type 0 to exit:  ");
            number = scanner.nextInt();
            while(number!=0){
                if(number>=1 && number<=2000000000){
                    if(number==1){
                        System.out.print("NUMBER AFTER CONVERSION:\tZERO");
                    } else {
                        System.out.print("NUMBER AFTER CONVERSION:\t");
                        numberToWord(((number / 100000000) % 10), " Billion");
                        numberToWord((number % 100), " ");
                    }

                } else{
                    System.out.print("NUMBER OUT OF RANGE");
                }
                System.out.print("\nPlease type a number between 1 and 2 billion OR type 0 to exit:  ");
                number = scanner.nextInt();
            }
        }

        public static void numberToWord(int num, String val) {
            String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
            };
            String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
            String hundreds[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
            };
            if (num > 19) {
                System.out.print(hundreds[num / 100] + " " tens[num / 10] + " " + ones[num % 10]);
            } else {
                System.out.print(ones[num]);
            }
            if (num > 0) {
                System.out.print(val);
            }
        }
    }
