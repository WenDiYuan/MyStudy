import java.util.Scanner;


public class XuanZheJieGou {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���������ĳɼ�");
		float a=sc.nextFloat();
		System.out.println("�����������Ա�");
		String xb=sc.next();
		if(a<=10){
			if(xb.equals("��")){System.out.println("��ϲ����뵽�������㱻���䵽������");}
			else{System.out.println("��ϲ����뵽�������㱻���䵽Ů����");}
		}
		else{System.out.println("��Ǹ����û�н��뵽����");}

	}

}
