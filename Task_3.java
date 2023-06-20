//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Task_3 {
    public Task_3() {
    }

    public static void main(String[] args) {
        boolean getOut = false;
        System.out.println("-----------------------------------------------");
        Scanner sc = new Scanner(System.in);

        while(true) {
            while(!getOut) {
                System.out.printf("Enter number: ");
                double numA = sc.nextDouble();
                System.out.printf("Enter arithmetic operation symbol (one of '+','-','*','/'): ");
                char opChar = sc.next().charAt(0);
                System.out.printf("Enter second number: ");
                double numB = sc.nextDouble();
                System.out.println();
                double result;
                switch (opChar) {
                    case '*':
                        result = numA * numB;
                        System.out.printf("%.2f %c %.2f = %.2f\n", numA, opChar, numB, result);
                        break;
                    case '+':
                        result = numA + numB;
                        System.out.printf("%.2f %c %.2f = %.2f\n", numA, opChar, numB, result);
                        break;
                    case ',':
                    case '.':
                    default:
                        getOut = true;
                        break;
                    case '-':
                        result = numA - numB;
                        System.out.printf("%.2f %c %.2f = %.2f\n", numA, opChar, numB, result);
                        break;
                    case '/':
                        result = numA / numB;
                        System.out.printf("%.2f %c %.2f = %.2f\n", numA, opChar, numB, result);
                }

                System.out.println("-----------------------------------------------");
                System.out.printf("Once more? ('Y' or 'y'): ");
                opChar = sc.next().charAt(0);
                if (opChar != 'y' && opChar != 'Y') {
                    getOut = true;
                } else {
                    getOut = false;
                }
            }

            System.out.println();
            sc.close();
            return;
        }
    }
}