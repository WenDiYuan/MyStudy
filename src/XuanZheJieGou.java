import java.util.Scanner;


public class XuanZheJieGou {

	public static void main(String[] args) {
		System.out.println("请输入您的成绩");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		System.out.println("请输入您的性别，男生请按1，女生请按2");
		Scanner cs=new Scanner(System.in);
		int b=cs.nextInt();
		if(a<=10){
			if(b==1){System.out.println("恭喜你进入到决赛，你被分配到男子组");}
			else{System.out.println("恭喜你进入到决赛，你被分配到女子组");}
		}
		else{System.out.println("抱歉，你没有进入到决赛");}

	}

}
