/**
 * @author arybalko
 * Программа определяет чётность/нечётность числа
 * Task_01 Задача 3
 */
package ru.mai.is.tmp.students.arybalko.Task_01;
import java.util.Scanner;
public class Parity {
	public static void main(String[] args) {
		System.out.print("Введите натуральное число: ");
		Scanner scan= new Scanner(System.in);
		int number = scan.nextInt();
		if (number%2==0) {
			System.out.println ("Число "+number+" чётное");
		} else 
			System.out.println ("Число "+number+" нечётное");
	}	
}
