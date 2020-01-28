import java.util.Scanner;


public class XuanZheJieGou {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入您的成绩");
		float a=sc.nextFloat();
		System.out.println("请输入您的性别");
		String xb=sc.next();
		if(a<=10){
			if(xb.equals("男")){System.out.println("恭喜你进入到决赛，你被分配到男子组");}
			else{System.out.println("恭喜你进入到决赛，你被分配到女子组");}
		}
		else{System.out.println("抱歉，你没有进入到决赛");}

	}

}
