package com.chuan;

public class Fruit {
	private String name;//ˮ��������
	private int size;//ˮ��������
	private int prize;//ˮ���ļ۸�
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	public int getPrize() {
		return prize;
	}
	//���캯��
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
