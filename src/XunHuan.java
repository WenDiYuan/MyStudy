import java.util.Scanner;


public class XunHuan {

	public static void main(String[] args) {
int i=0;double sum=0;
		for(i=0;i<5;i++){
			System.out.println("请输入第"+(i+1)+"门成绩");
			Scanner sc=new Scanner(System.in);
			double a=sc.nextDouble();
			sum+=a;
}
double avg=sum/5;
System.out.println("平均分是："+avg);
	}

}
