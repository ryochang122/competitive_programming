package jp.competitive;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ABC214B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int s = sc.nextInt(), t = sc.nextInt();
            logic(s, t);
        }
    }

    public static void logic(int s, int t) {
        int a, b, c, cnt;
        a = b = c = cnt = 0;
        for (a = 0; a <= s; a++) {
            for (b = 0; a + b <= s; b++) {
                for (c = 0; a + b + c <= s; c++) {
                    if (a * b * c <= t)
                        cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
