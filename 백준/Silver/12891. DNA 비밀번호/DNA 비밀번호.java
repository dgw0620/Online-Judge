import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] checkArr = new int[4];
    static int[] tempArr = new int[4];
    static int checkCount = 0;

    public static void Add (char c) {
        switch (c) {
            case 'A':
                tempArr[0]++;
                if (tempArr[0] == checkArr[0]) checkCount++;
                break;
            case 'C':
                tempArr[1]++;
                if (tempArr[1] == checkArr[1]) checkCount++;
                break;
            case 'G':
                tempArr[2]++;
                if (tempArr[2] == checkArr[2]) checkCount++;
                break;
            case 'T':
                tempArr[3]++;
                if (tempArr[3] == checkArr[3]) checkCount++;
                break;
        }
    }

    public static void Sub (char c) {
        switch (c) {
            case 'A':
                if (tempArr[0] == checkArr[0]) checkCount--;
                tempArr[0]--;
                break;
            case 'C':
                if (tempArr[1] == checkArr[1]) checkCount--;
                tempArr[1]--;
                break;
            case 'G':
                if (tempArr[2] == checkArr[2]) checkCount--;
                tempArr[2]--;
                break;
            case 'T':
                if (tempArr[3] == checkArr[3]) checkCount--;
                tempArr[3]--;
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int p = sc.nextInt();
        int count = 0;

        sc.nextLine();
        char[] charArr = sc.nextLine().toCharArray();

        for (int i = 0; i < 4; i++) {
            checkArr[i] = sc.nextInt();
            if (checkArr[i] == 0)
                checkCount++;
        }

        for (int i = 0; i < p; i ++) {
            Add(charArr[i]);
        }

        if (checkCount == 4) count++;

        for (int i = p; i < s; i++) {
            int j = i - p;
            Add(charArr[i]);
            Sub(charArr[j]);

            if (checkCount == 4) count++;
        }

        System.out.println(count);
    }
}
