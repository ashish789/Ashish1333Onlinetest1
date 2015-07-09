package onlinetest1;

public class BallotUnit {
	
	State status;
	Integer NumberOfCandidates;
	BallotPapperPanel vpanel;
	
	
	public BallotUnit(Integer noc){
		this.NumberOfCandidates=noc;
		this.status=new Idle();	
		
		for(int i=0;i<noc;i++){
			
			
		}
		
	}

	public State getStatus() {
		return status;
	}

	public void setStatus(State status) {
		this.status = status;
	}
	
	
	
	

}
