package com.chuan;

public class Fruit {
	private String name;//水果的名字
	private int size;//水果的重量
	private int prize;//水果的价格
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	public int getPrize() {
		return prize;
	}
	//构造函数
	public Fruit(){
		name=null;
		size=0;
		prize=0;
	}
	public Fruit(String name, int size, int prize){
		this.name=name;
		this.size=size;
		this.prize=prize;
	}

}
