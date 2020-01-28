import java.util.Scanner;


public class JiShuanQi {

	public static void main(String[] args) {
System.out.println("请选者你要进行的操作，+：1、-:2、*:3、/:4");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("请输入第一个数");
float b=sc.nextFloat();
System.out.println("请输入第二个数");
float c=sc.nextFloat();
switch (a){
case 1:
	float d=b+c;
	System.out.println("两数之和为："+d);
	break;
case  2:
	float e=b-c;
	System.out.println("两数之差为："+e);
	break;
case 3:
	float f=b*c;
	System.out.println("两数之积为："+f);
	break;
case 4:
	float g=b/c;
	System.out.println("结果为："+g);
	break;
	default:
		System.out.println("你输入有误！");
	
}
	}

}
