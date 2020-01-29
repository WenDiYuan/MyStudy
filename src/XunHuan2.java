
public class XunHuan2 {

	public static void main(String[] args) {
	    for (int i = 2; i <= 100; i++) {
	    	            int a=1;
	    	            for (int j = 2; j < i; j++) {
	    	                if (0 == i % j) {
	    	                    a=0;
	    	                    break;
	    	                }
	    	            }
	    	            if (a==1) {
	    	                System.out.print(i + " ");
	    	            }
	    	        }
	}

}
