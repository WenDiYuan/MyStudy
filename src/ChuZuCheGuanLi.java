import java.util.Calendar;
import java.util.Scanner;


public class ChuZuCheGuanLi {

	public static void main(String[] args) {
double qm;//ǧ����
int dd;//�ȴ�ʱ��
int ddf;//�ȴ���
double lcf;//��̷�
double ksf;//��ʻ��
double zj;//�ܼ�
int dq=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);//��ȡ��ǰʱ��
System.out.println("������������ʻ�Ĺ���������λ��ǧ��");
Scanner sc=new Scanner(System.in);
qm=sc.nextDouble();
System.out.println("���������ĵȴ�ʱ�䣬��λ������");
Scanner cs=new Scanner(System.in);
dd=cs.nextInt();
if(dq>=7&&dq<=23){
	if(qm>3){
		lcf=10+Math.ceil(qm-3)*2;
	}
	else{lcf=10;}
}else{
	if(qm>3){
	lcf=12+Math.ceil(qm-3)*2.3;	
	}
	else{lcf=12;}
}
if(qm>15){
	ksf=Math.ceil(qm-15);
}else{ksf=0;}
	ddf=(dd/5)*2;
	System.out.println("���⳵Ӧ�տ����£�"+"��̷�"+lcf+"��ʻ��"+ksf+"�ȴ���"+ddf);
	System.out.println("�ܼƣ�"+(lcf+ksf+ddf));
	}

}
