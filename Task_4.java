//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Task_4 {
    public Task_4() {
    }

    public static void main(String[] args) {
        String taskStr = "";
        int numOne = 0;
        int numTwo = 0;
        int exprResult = 0;
        String strOne = "";
        String strTwo = "";
        String strOneVers = "";
        String strTwoVers = "";
        int myDigit = 0;
        System.out.println("=======================================================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression like this:  ?54 + 1?1 = 375");
        System.out.println("By default (pressing Enter) the expression will be equal to '?54 + 1?1 = 375'");
        System.out.println("Enter your expression or press Enter, please: ");
        taskStr = sc.nextLine();
        if (taskStr == "") {
            taskStr = "?54 + 1?1 = 375";
        }

        System.out.println(taskStr);
        String[] expressionArr = taskStr.split("=");
        int size = expressionArr.length;

        try {
            exprResult = Integer.parseInt(expressionArr[size - 1].trim());
            expressionArr[size - 1] = expressionArr[size - 1].trim();
        } catch (NumberFormatException var18) {
            System.out.println("NumberFormatException: " + var18.getMessage());
        }

        String terms = expressionArr[0];
        int plusIndex = terms.indexOf("+");

        int i;
        for(i = 0; i < terms.indexOf("+"); ++i) {
            strOne = strOne + terms.charAt(i);
        }

        strOne = strOne.trim();

        for(i = terms.indexOf("+") + 1; i < terms.length() - 1; ++i) {
            strTwo = strTwo + terms.charAt(i);
        }

        strTwo = strTwo.trim();

        for(i = 0; i < 10; ++i) {
            int j;
            for(j = 0; j < strOne.length(); ++j) {
                if (strOne.charAt(j) == '?') {
                    strOneVers = strOneVers + i;
                } else {
                    strOneVers = strOneVers + strOne.charAt(j);
                }
            }

            for(j = 0; j < strTwo.length(); ++j) {
                if (strTwo.charAt(j) == '?') {
                    strTwoVers = strTwoVers + i;
                } else {
                    strTwoVers = strTwoVers + strTwo.charAt(j);
                }
            }

            try {
                numOne = Integer.parseInt(strOneVers);
                numTwo = Integer.parseInt(strTwoVers);
            } catch (NumberFormatException var17) {
                System.out.println("NumberFormatException " + var17.getMessage());
            }

            if (numOne + numTwo == exprResult) {
                myDigit = i;
                break;
            }

            strOneVers = "";
            strTwoVers = "";
        }

        System.out.println("BINGO !!!");
        System.out.println("The desired digit is " + myDigit);
        System.out.printf("%s + %s = %s\n", strOneVers, strTwoVers, exprResult);
        System.out.println("=======================================================================");
    }
}