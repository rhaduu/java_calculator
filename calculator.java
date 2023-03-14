import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char op, yesno;
        int a, b, r;
        System.out.println("Hello! I'm gonna be your calculator today!");
        System.out.println("Please enter: ");
        System.out.print("variable: ");a = scan.nextInt();
        System.out.print("operation: ");op = scan.next().charAt(0);
        System.out.print("variable: ");b= scan.nextInt();
        System.out.println();
        System.out.println("Your operation is: "+a+op+b);

        //checks for the operation that the user selected
        switch (op){
            case '+': {
                r = a + b;
                System.out.println(a + "+" + b + "=" + r);
                break;
            }
            case '-': {
                r = a - b;
                System.out.println(a + "-" + b + "=" + r);
                break;
            }
            case '*': {
                r = a * b;
                System.out.println(a+"*"+b+"="+r);
                break;
            }
            case '/':{
                r = a/b;
                System.out.println(a+"/"+b+"="+r);
                break;
            }
            default:
                System.out.println("Invalid operation!");

        }
         //ask's if the user would like to make another calculation

        System.out.println("Do you want to do another calc? Y/N:");
        yesno = scan.next().charAt(0);
        if (yesno == 'Y'||yesno == 'y'){
            while(yesno == 'Y'||yesno =='y') {
                System.out.print("variable: ");a = scan.nextInt();
                System.out.print("operation: ");op = scan.next().charAt(0);
                System.out.print("variable: ");b= scan.nextInt();
                System.out.println("Your operation is: " + a + op + b);
                //repeat the cycle
                switch (op) {
                    case '+': {
                        r = a + b;
                        System.out.println(a + "+" + b + "=" + r);
                        System.out.println("Do you want to do another calc? Y/N: ");
                        yesno = scan.next().charAt(0);
                        if(yesno == 'Y'|| yesno == 'y') continue;
                        else
                            break;
                    }
                    case '-': {
                        r = a - b;
                        System.out.println(a + "-" + b + "=" + r);
                        System.out.println("Do you want to do another calc? Y/N: ");
                        yesno = scan.next().charAt(0);
                        if(yesno == 'Y'|| yesno == 'y') continue;
                        else
                            break;
                    }
                    case '*': {
                        r = a * b;
                        System.out.println(a + "*" + b + "=" + r);
                        System.out.println("Do you want to do another calc? Y/N: ");
                        yesno = scan.next().charAt(0);
                        if(yesno == 'Y'|| yesno == 'y') continue;
                        else
                            break;
                    }
                    case '/': {
                        r = a / b;
                        System.out.println(a + "/" + b + "=" + r);
                        System.out.println("Do you want to do another calc? Y/N: ");
                        yesno = scan.next().charAt(0);
                        if(yesno == 'Y'|| yesno == 'y') continue;
                        else
                            break;
                    }
                    default:
                        System.out.println("Invalid operation!");

                }
                //the user changes his/hers option and the program ends
                if (yesno == 'N' || yesno == 'n'){
                    System.out.println("Thanks for using the calculator! :)");
                    break;
                }
            }
        }
        //the user's first option is to not execute another calc so the program ends
        else {
            System.out.println("Thanks for using the calculator! :)");
            System.exit(0);
        }
    }
}