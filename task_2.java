//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class task_2 {
    public task_2() {
    }

    public static void main(String[] args) {
        int countInRow = 15;
        int n = 1;
        int maxNum = 1000;
        int k = -1;
        Object[] var10001 = new Object[]{1};
        String resNumStr = String.format("%4d", var10001) + " ";
        resNumStr = resNumStr + String.format("%4d", 2) + " ";
        resNumStr = resNumStr + String.format("%4d", 3) + " ";
        resNumStr = resNumStr + String.format("%4d", 5) + " ";
        System.out.printf(resNumStr);
        int countNumbers = 4;

        while(6 * n + k < maxNum) {
            k *= -1;
            int resNum = 6 * n - k;
            if (resNum % 5 != 0) {
                var10001 = new Object[]{resNum};
                resNumStr = String.format("%4d", var10001) + " ";
                ++countNumbers;
                System.out.printf(resNumStr);
                if (countNumbers == countInRow) {
                    System.out.println();
                    countNumbers = 0;
                }
            }

            if (k < 0) {
                ++n;
            }
        }

    }
}