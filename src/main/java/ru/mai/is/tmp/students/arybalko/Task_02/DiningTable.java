/**
 * @author arybalko
 * 3-й по порядку
 */
package ru.mai.is.tmp.students.arybalko.Task_02;
public class DiningTable extends Furniture {
	String Type = ("Обеденный стол");
	private int Lenght;
	public int getLenght(){
		return Lenght;
	}
	public void setLenght (int Lenght) {
	if (Lenght>80) {
		this.Lenght=Lenght;
		System.out.println("Длина "+getLenght()+"! Вам так удобно?");
	} else {
		this.Lenght=80;
		System.out.println("Пусть длина будет лучше "+getLenght()+". Я думаю, так будет комфортнее.");
	}
	}
	private int Widht;
	public int getWidht(){
		return Widht;
	}
	public void setWidht (int Widht) {
	if (Widht>70) {
		this.Widht=Widht;
		System.out.println("Ширина "+getWidht()+"! Вам так удобно?");
	} else {
		this.Widht=70;
		System.out.println("Пусть ширина будет лучше "+getLenght()+". Я думаю, так будет комфортнее.");
	}
	}
	private int Height;
	public int getHeight(){
		return Height;
	}
	public void setHeight (int Height) {
	if (Height>75) {
		this.Height=Height;
		System.out.println("Высота "+getHeight()+"! Вам так удобно?");
	} else {
		this.Height=75;
		System.out.println("Пусть высота будет лучше "+getHeight()+". Я думаю, так будет комфортнее.");
	}
	}
	public void Creation(){
		System.out.println ("Тип созданной мебели: "+Type);
		System.out.println ("Габариты (ДхШхВ): "+getLenght()+"x"+getWidht()+"x"+getHeight());
	}
}
