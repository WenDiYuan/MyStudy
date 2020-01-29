import java.util.Calendar;
import java.util.Scanner;


public class ChuZuCheGuanLi {

	public static void main(String[] args) {
double qm;//千米数
int dd;//等待时间
int ddf;//等待费
double lcf;//里程费
double ksf;//空驶费
double zj;//总价
int dq=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);//获取当前时间
System.out.println("请您输入您行驶的公里数，单位：千米");
Scanner sc=new Scanner(System.in);
qm=sc.nextDouble();
System.out.println("请输入您的等待时间，单位：分钟");
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
	System.out.println("出租车应收款如下："+"里程费"+lcf+"空驶费"+ksf+"等待费"+ddf);
	System.out.println("总计："+(lcf+ksf+ddf));
	}

}
