import java.util.Scanner;


public class XunHuan {

	public static void main(String[] args) {
int i=0;double sum=0;
		for(i=0;i<5;i++){
			System.out.println("�������"+(i+1)+"�ųɼ�");
			Scanner sc=new Scanner(System.in);
			double a=sc.nextDouble();
			sum+=a;
}
double avg=sum/5;
System.out.println("ƽ�����ǣ�"+avg);
	}

}
