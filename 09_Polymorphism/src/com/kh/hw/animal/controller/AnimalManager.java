package com.kh.hw.animal.controller;

import com.kh.hw.animal.model.vo.*;

public class AnimalManager {
	
	public static void main(String[] args) {
		
		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog("a", "푸들", 4);
		arr[1] = new Dog("b", "말티즈", 3);
		arr[2] = new Cat("ㅁ", "코숏", "뒷산", "노랑");
		arr[3] = new Dog("c", "진돗개", 6);
		arr[4] = new Cat("ㄱ", "스핑크스", "우리집", "흰색");
		
		for(Animal animal : arr) {
			animal.speak();
		}
	}

	
	
	
}
