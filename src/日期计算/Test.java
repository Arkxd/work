package 日期计算;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int year, month, day;
        int[] bmonth = {1, 3, 5, 7, 8, 10, 12};
        int[] smonth = {4, 6, 9, 11};
        Scanner input = new Scanner(System.in);
        System.out.println("输入年份");
        year = input.nextInt();
        if (year <= 9998 && year >= 1000) {
            System.out.println("输入月份");
            month = input.nextInt();
            if (month > 1 && month < 12) {
                System.out.println("输入日份");
                day = input.nextInt();
                day += 2;
                if (day < 2) {
                    System.out.println("日期错误");
                }else if (month == 2) {
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        if (day > (29 + 2)) {
                            System.out.println("输入日期错误");
                        } else if (day > 29) {
                            month += 1;
                            day -= 29;
                        }
                    } else {
                        if (day > (28 + 2)) {
                            System.out.println("输入日期错误");
                        } else if (day > 28) {
                            month += 1;
                            day -= 28;
                        }
                    }
                } else if (NumberExit(bmonth, month)) {
                    if (day > (31 + 2)) {
                        System.out.println("输入日期错误");
                    } else if (day > 31) {
                        month += 1;
                        day -= 31;
                    }
                } else if (NumberExit(smonth, month)) {
                    if (day > (30 + 2)) {
                        System.out.println("输入日期错误");
                    } else if (day > 30) {
                        month += 1;
                        day -= 30;
                    }
                }
                if (month > 12) {
                    year += 1;
                    month -= 12;
                }
                System.out.println("所给日期的后天为：" + year + "年" + month + "月" + day + "日");
            } else {
                System.out.println("月份错误");
            }
        } else {
            System.out.println("年份错误");
        }
    }
    public static boolean NumberExit(int[] array, int number) {
        for (int j : array) {
            if (number == j) {
                return true;
            }
        }
        return false;
    }
}
