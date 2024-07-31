/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.financialforecastingtool;

/**
 *
 * @author nikhi
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FinancialForecastingTool {

    private static Map<Integer, Double> result = new HashMap<>();
    public static double calculate(double current, double growth, int time) {
        if (time== 0) {
            return current;
        }
        if (result.containsKey(time)) {
            return result.get(time);
        }
        double future = calculate(current, growth, time - 1) * (1 + growth);
        result.put(time, future);
        return future;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter current value: ");
        double current = scanner.nextDouble();

        System.out.print("Enter annual growth rate (as a decimal): ");
        double growth = scanner.nextDouble();

        System.out.print("Enter number of periods into the future: ");
        int time = scanner.nextInt();

       
        double future = calculate(current, growth, time);

        System.out.println("The predicted future value after " + time + " periods is: " + future);
        
    }
}
