package onlinetest1;

public class Idle extends State {

	public Idle(){
		
		this.name="Idle";
		
	}
	
	
	@Override
	void Switch(BallotUnit bu) {
		// TODO Auto-generated method stub
		  State new2=new Ready();
		  bu.setStatus(new2);
			
		
	}

}
