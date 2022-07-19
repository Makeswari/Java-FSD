package demo;

public class innerclassA2 {
	private String msg="Inner Classes in methods";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		innerclassA2  ob=new innerclassA2 ();  
		ob.display();  
		}


}
