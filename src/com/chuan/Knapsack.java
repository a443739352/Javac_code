package com.chuan;

public class Knapsack {

	public static void main(String[] args) {
		final int MAX=8;//��������
		final int MIN=1;//��С����
		final int KIND=5;//ˮ������
		int []item=new int[MAX+1];
		int []value=new int[MAX+1];
		Fruit []fruits=new Fruit[KIND];
		fruits[0]=new Fruit("����",4,4500);
	    fruits[1]=new Fruit("ƻ��",5,5700);
		fruits[2]=new Fruit("����",2,2250);
		fruits[3]=new Fruit("��ݮ",1,1100);
		fruits[4]=new Fruit("���",6,6700);
		for(int i=0;i<fruits.length;i++){
			for(int s=fruits[i].getSize();s<=MAX;s++){
				int p=s-fruits[i].getSize();
				int newvalue=value[p]+fruits[i].getPrize();
				if(newvalue>value[s]){//�ҵ��׶���ѽ�
					value[s]=newvalue;
					item[s]=i;
				}
			}
		}
		System.out.println("��Ʒ\t�۸�");
		for(int i=MAX;i>=MIN;i=i-fruits[item[i]].getSize()){
			System.out.println(fruits[item[i]].getName()+"\t"
					+fruits[item[i]].getPrize());
		}
		System.out.println("�ϼ�\t"+value[MAX]);

	}

}
