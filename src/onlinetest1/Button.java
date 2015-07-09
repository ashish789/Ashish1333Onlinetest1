package onlinetest1;

public class Button {

	String name;
	boolean status;
	
	Button(String n){
		
		this.name=n;
		this.status=false;
		
	}
	
	
	Button()
	{
		
		
	}
	
	
	
	boolean pressed(){
		this.status=true;
		
		
		return true;
	}
}

