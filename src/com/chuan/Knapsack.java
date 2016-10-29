package com.chuan;

public class Knapsack {

	public static void main(String[] args) {
		final int MAX=8;//重量限制
		final int MIN=1;//最小重量
		final int KIND=5;//水果种类
		int []item=new int[MAX+1];
		int []value=new int[MAX+1];
		Fruit []fruits=new Fruit[KIND];
		fruits[0]=new Fruit("李子",4,4500);
	    fruits[1]=new Fruit("苹果",5,5700);
		fruits[2]=new Fruit("橘子",2,2250);
		fruits[3]=new Fruit("草莓",1,1100);
		fruits[4]=new Fruit("甜瓜",6,6700);
		for(int i=0;i<fruits.length;i++){
			for(int s=fruits[i].getSize();s<=MAX;s++){
				int p=s-fruits[i].getSize();
				int newvalue=value[p]+fruits[i].getPrize();
				if(newvalue>value[s]){//找到阶段最佳解
					value[s]=newvalue;
					item[s]=i;
				}
			}
		}
		System.out.println("物品\t价格");
		for(int i=MAX;i>=MIN;i=i-fruits[item[i]].getSize()){
			System.out.println(fruits[item[i]].getName()+"\t"
					+fruits[item[i]].getPrize());
		}
		System.out.println("合计\t"+value[MAX]);

	}

}
