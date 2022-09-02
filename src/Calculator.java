import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println ("Калькулятор запущен. \nВведите первое число: ");
        Scanner Digit = new Scanner(System.in);
        double firstUserNum = Digit.nextDouble();
        System.out.println ("Введите второе число: ");
        double secondUserNum = Digit.nextDouble();

        System.out.println("Введите одно из четырёх арифметических действий (+,-,/,*): ");
        String userArithOp = Digit.next();

        String plusMob = "+";
        String minusMob = "-";
        String umnozMob = "*";
        String delenMob = "/";



        if (userArithOp.equals(plusMob)) {
            Addition summa = new Addition();
            summa.addition(firstUserNum, secondUserNum);
        }
        else {
            if (userArithOp.equals(minusMob)) {
                Division raznost = new Division();
                raznost.division(firstUserNum, secondUserNum);
            }
            else {
                if (userArithOp.equals(umnozMob)) {
                    Multiplication proizved = new Multiplication();
                    proizved.multiplic(firstUserNum, secondUserNum);
                } else {
                    if (userArithOp.equals(delenMob)) {
                        Substraction delenie = new Substraction();
                        delenie.substract(firstUserNum, secondUserNum);
                    }
                    else {
                        System.out.print("Введены некорректные данные!");
                    }
                }
            }
        }
    }
}