package TestNG_FirstTC;

import org.testng.annotations.Test;

public class SecondTestcase {
	
	int a=10;
	int b=100;
	int res;
	
	@Test
	public  void show() {
		System.out.println("addition="+(a+b));
		
	}
	@Test
	public void dispaly() {
		System.out.println("Addition of res="+res);
	}
	
	public static void main(String[] args) {
		
		SecondTestcase st=new SecondTestcase();
		st.show();
		st.dispaly();
				
		
		
	}

}
