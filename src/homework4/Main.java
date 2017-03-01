package homework4;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		one();
		two();
		three();
		four();
		five();
		six();
		seven();
		eight();
		nine();
		ten();

	}

	static void one() {

		int a = 0;
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0)
				a++;
		}
		int[] array = new int[a];
		for (int i = 2, b = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				array[b] = i;
				System.out.print(array[b] + " ");
				b++;
			}
		}
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	static void two() {

		int a = 0;
		for (int i = 1; i <= 99; i++) {
			if (i % 2 != 0)
				a++;
		}

		int[] Mas = new int[a];
		for (int i = 1, b = 0; i <= 99; i++) {
			if (i % 2 != 0) {
				Mas[b] = i;
				System.out.print(Mas[b] + " ");
				b++;
			}
		}

		System.out.println(" ");
		for (int i = Mas.length - 1; i >= 0; i--) {
			System.out.println(Mas[i]);
		}
	}

	static void three() {
		int b = 0;
		int[] Mas = new int[15];
		for (int i = 0; i < Mas.length; i++) {
			Random rnd = new Random();
			Mas[i] = rnd.nextInt(10);
			System.out.print(Mas[i] + " ");
			if (Mas[i] > 0 & Mas[i] % 2 == 0)
				b++;
		}
		System.out.println(" ");
		System.out.println(b);
	}

	static void four() {
		int[] Mas = new int[8];
		for (int i = 0; i < Mas.length; i++) {
			Mas[i] = (int) (Math.random() * 9 + 1);
			System.out.print(Mas[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < Mas.length; i++) {
			if (Mas[i] % 2 != 0)
				Mas[i] = 0;

			System.out.print(Mas[i] + " ");

		}
		System.out.println("");
	}

	static void five() {
		double sumMas1 = 0, sumMas2 = 0;
		int[] Mas1 = new int[5];
		for (int i = 0; i < Mas1.length; i++) {
			Mas1[i] = (int) (Math.random() * 6);
			System.out.print(Mas1[i] + " ");
			sumMas1 += (double) Mas1[i] / Mas1.length;
		}
		System.out.println(" ");
		int[] Mas2 = new int[5];
		for (int i = 0; i < Mas2.length; i++) {
			Mas2[i] = (int) (Math.random() * 6);
			System.out.print(Mas2[i] + " ");
			sumMas2 += (double) Mas2[i] / Mas2.length;
		}
		System.out.println(" ");
		if (sumMas1 == sumMas2)
			System.out.println("������ ����������� ���� ������");
		else {
			if (sumMas1 > sumMas2)
				System.out.println("������ ����������� ������� ������ ����� " + sumMas1);
			else {
				System.out.println("������ ����������� ������� ������ ����� " + sumMas2);
			}
		}
	}

	static void six() {
		int[] Mas = new int[4];
		for (int i = 0; i < Mas.length; i++) {
			Mas[i] = (int) (Math.random() * 90 + 10);
			System.out.print(Mas[i] + " ");
		}
		for (int i = 0; i < Mas.length; i++) {
			
			if (i > 0) {
				if (Mas[i - 1] >= Mas[i]) {
					System.out.println("���������� �� ������������");
					break;

				}
			}
			
			if (i == Mas.length - 1)
				System.out.println("������������������ ������ ������������");
		}
	}

	static void seven() {
		int[] Mas = new int[20];
		
		for (int i = 0; i < Mas.length; i++) {
			// ���� ������ �������� ������� ������ 2 ����������� ��� �������� 1
			if (i < 2) {
				Mas[i] = 1;
			}
			// �� ���� ��������� ������� �������� �������� ������� ����� �����
			// �������� ���� ���������� ��������� �������
			else {
				Mas[i] = Mas[i - 2] + Mas[i - 1];
			}
			System.out.print(Mas[i] + " ");
		}
	}

	static void nine() {
        //�������� 3 ������� 
       int[] Mas1=new int[10];
       int[] Mas2=new int[10];
       double[]Mas3=new double[10];
       //�������� ���������� �� �������� ������� ����� ������� ������������ ������ ���������� ����� ����� � 3 �������.
       int SC=0;
       //��� ������ ����� �������� �������� ������� �������
       //� �������� ������������ � ���������� ������� ��� ����������� ������ ��� ������ ������ �����. ��� ����� ���� ���������� b, ������� �������� ��������� �����, ������� ���������� ��������� ��� ������ �����. ������ ��� ����� ������ ����� ����������, �������� b ������������� � ���� ���������� ������� (�����).
       for(int i=0,b=1;b<=4;i++){
          if(b==1){
              Mas1[i]=(int)(Math.random()*8)+1;
              if(i==0)
                  System.out.print((b)+ " ������ ������� �� ��������� ���������: ");
              System.out.print(Mas1[i]+" ");
               if(i==Mas1.length-1){
                   b++;
                   i=0;
                   System.out.println(" ");
               }
          }
          if(b==2){
              Mas2[i]=(int)(Math.random()*8)+1;
              if(i==0)
                  System.out.print((b)+ " ������ ������� �� ��������� ���������: ");
              System.out.print(Mas2[i]+" ");
              if(i==Mas2.length-1){
                  b++;
                  i=0;
                  System.out.println(" ");
              }
          }
          if(b==3){
              Mas3[i]=(double)Mas1[i]/Mas2[i];
              if(i==0)
                  System.out.print((b)+ " ������ ������� �� ��������� ���������: ");
              System.out.print(Mas3[i]+ " ");
              if(i==Mas3.length-1){
                  b++;
                  i=0;
                  System.out.println(" ");
              }
          }
          
          if(b==4){
              if(Mas3[i]%(int)Mas3[i]==0){
                  if(SC==0)
                      System.out.print("� 3 ������� ��������� ����� �����: ");
                  SC++;
                  System.out.print(Mas3[i]+", ");
              }
              if(i==Mas3.length-1){
                  if(SC==0)
                      System.out.println("� ������� ������� ��� ����� �����!");
                  break;
              }
          }
               
       }
	}

	static void eight() {

	}

	static void ten() {
		System.out.println("������ 10");
        //�������� ����������, � ������� ����� ����������� ��������� ���������� ������ �������
       int am=0,a0=0,a1=0;
       int[] Mas = new int[11];
       for(int i=0; i<Mas.length; i++){
           Mas[i]=(int)(Math.random()*3)-1;
           System.out.print(Mas[i]+" ");
           //� ����������� �� ������� ����������� ��������������� "�������"
           if(Mas[i]< 0)am++;
           if(Mas[i]==0)a0++;
           if(Mas[i]>0)a1++;
           //����� ���������� ���������� �������� ������� ������� �������� "���������" � ��������� �����, ������� ����������� ���� �����
           if(i==Mas.length-1){
               if(am>a0&am>a1)
                   System.out.println("���� ����� ����������� -1");
               if(a0>am&a0>a1)
                   System.out.println("���� ����� ����������� 0");
               if(a1>am&a1>a0)
                   System.out.println("���� ����� ����������� 1");
           }
       }  
	}

}
