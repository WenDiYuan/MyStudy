import java.util.Scanner;



public class ShuZu1 {

	public static void main(String[] args) {
		int b=0;
Scanner cj =new Scanner(System.in);
int[]a=new int[5];
String[] name={"shuxue","yuwen","yinyu","zhuanye","tiyu"};
for(int i=0;i<a.length;i++){
	System.out.println("请输入"+name[i]+"的成绩");
	a[i]=cj.nextInt();
	
	b+=a[i];
}
System.out.println("五门成绩之和为："+b);
	}

}
