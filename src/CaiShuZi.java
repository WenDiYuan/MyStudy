import java.util.Random;
import java.util.Scanner;


public class CaiShuZi {

	public static void main(String[] args) {
		int b;
int d=(int)(Math.random()*100);
Scanner sc=new Scanner(System.in);
for( b=0;b<=10;b++){
	System.out.println("��һ������0��100���ڣ�10�λ��ᣬ�㻹��"+(10-b)+"�λ���");
	int c=sc.nextInt();
	if(c>d){
		System.out.println("�´��ˣ���Сһ�����");
	}else if(c==d){System.out.println("��ϲ��  �¶���");break;}
	else{System.out.println("��С�ˣ�����һ�����");}
}
if(b>=10){System.out.println("��̫���� ���´�������");}

	}

}
