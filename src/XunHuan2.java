import java.util.Scanner;


public class XunHuan2 {

	public static void main(String[] args) {
		System.out.println("请输入一个数");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();int n=0;
	    for (int i = 2; i <= b; i++) {
	    	            int a=1;
	    	            for (int j = 2; j < i; j++) {
	    	                if (0 == i % j) {
	    	                    a=0;
	    	                    break;
	    	                }
	    	            }
	    	            if (a==1) {
	    	                System.out.print(i + " ");
	    	                n++;
	    	                if(n%10==0){System.out.println("");}
	    	            }
	    	        }
	}

}
