package onlinetest1;

public class Busy extends State {

	
    public Busy(){
		
		this.name="Busy";
		
	}
    
	@Override
	void Switch(BallotUnit bu) {
		// TODO Auto-generated method stub
		
		State new2=new Idle();
		 bu.setStatus(new2);
			
		
	}

	
	
}
