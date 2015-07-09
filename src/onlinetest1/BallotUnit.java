package onlinetest1;

import java.util.ArrayList;
import java.util.List;

public class BallotUnit {
	
	State status;
	Integer NumberOfCandidates;
	BallotPapperPanel vpanel;
	ControlUnit cu;
	
	public BallotUnit(Integer noc){
		this.NumberOfCandidates=noc;
		this.status=new Idle();	
		
		vpanel=new BallotPapperPanel("Ballot Panel");
		for(int i=0;i<noc;i++){
		  this.vpanel.voteButtons.add(new VoteButton(this));
		}
		
		
	}

	
	void switchState(){
		
	   status.Switch(this);	
		
	}
	

	
	
	
	
	
	
	
	
	public State getStatus() {
		return status;
	}

	public void setStatus(State status) {
		this.status = status;
	}
	
	
	
	

}
