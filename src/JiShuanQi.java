import java.util.Scanner;


public class JiShuanQi {

	public static void main(String[] args) {
System.out.println("��ѡ����Ҫ���еĲ�����+��1��-:2��*:3��/:4");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("�������һ����");
float b=sc.nextFloat();
System.out.println("������ڶ�����");
float c=sc.nextFloat();
switch (a){
case 1:
	float d=b+c;
	System.out.println("����֮��Ϊ��"+d);
	break;
case  2:
	float e=b-c;
	System.out.println("����֮��Ϊ��"+e);
	break;
case 3:
	float f=b*c;
	System.out.println("����֮��Ϊ��"+f);
	break;
case 4:
	float g=b/c;
	System.out.println("���Ϊ��"+g);
	break;
	default:
		System.out.println("����������");
	
}
	}

}
