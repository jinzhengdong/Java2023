package me.ereach.mortgage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取贷款总额
        System.out.print("请输入贷款总额（万元）：");
        double totalLoan = scanner.nextDouble() * 10000;

        // 读取贷款期限
        System.out.print("请输入贷款期限（年）：");
        int loanTerm = scanner.nextInt();

        // 读取年利率
        System.out.print("请输入年利率（%）：");
        double annualInterestRate = scanner.nextDouble() / 100;

        // 计算每月还款金额
        double monthlyInterestRate = annualInterestRate / 12;
        int totalPayments = loanTerm * 12;
        double monthlyPayment = (totalLoan * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments))
                / (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        // 计算还款总额
        double totalPayment = monthlyPayment * totalPayments;

        // 输出计算结果
        System.out.printf("每月还款金额为：%.2f 元%n", monthlyPayment);
        System.out.printf("还款总额为：%.2f 元%n", totalPayment);
    }
}

