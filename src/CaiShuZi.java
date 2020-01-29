import java.util.Random;
import java.util.Scanner;


public class CaiShuZi {

	public static void main(String[] args) {
		int b;
int d=(int)(Math.random()*100);
Scanner sc=new Scanner(System.in);
for( b=0;b<=10;b++){
	System.out.println("猜一个数字0到100以内，10次机会，你还有"+(10-b)+"次机会");
	int c=sc.nextInt();
	if(c>d){
		System.out.println("猜大了，往小一点儿猜");
	}else if(c==d){System.out.println("恭喜你  猜对了");break;}
	else{System.out.println("猜小了，往大一点儿猜");}
}
if(b>=10){System.out.println("你太笨了 ，下次再来吧");}

	}

}
