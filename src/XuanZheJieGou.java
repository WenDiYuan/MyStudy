import java.util.Scanner;


public class XuanZheJieGou {

	public static void main(String[] args) {
		System.out.println("���������ĳɼ�");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		System.out.println("�����������Ա������밴1��Ů���밴2");
		Scanner cs=new Scanner(System.in);
		int b=cs.nextInt();
		if(a<=10){
			if(b==1){System.out.println("��ϲ����뵽�������㱻���䵽������");}
			else{System.out.println("��ϲ����뵽�������㱻���䵽Ů����");}
		}
		else{System.out.println("��Ǹ����û�н��뵽����");}

	}

}
