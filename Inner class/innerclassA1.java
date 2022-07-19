package demo;

public class innerclassA1 {
	private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Happy Learning");}  
	 }  


	public static void main(String[] args) {

		innerclassA1 obj=new innerclassA1();
		innerclassA1.Inner in=obj.new Inner();  
		in.hello();  
	}


}
