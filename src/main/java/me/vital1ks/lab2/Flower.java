package me.vital1ks.lab2;

import lombok.Getter;
public class Flower {
	@Getter private String name; //Сорт цветка
	@Getter private String main_color; //Основной цвет
	@Getter private String family; //Род
	@Getter private float height;//Высота
	@Getter private float price;//Цена

	public Flower(String name, String main_color, String family, float height, float price) {
		this.name = name;
		this.main_color = main_color;
		this.family = family;
		this.height = height;
		this.price = price;
	}
	
}
