package onlinetest1;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit {
	
	Integer TotalVotes;
	boolean status;
	ControlPanel ballotPanel;
	ControlPanel resultPanel;
	BallotUnit bu;
	//List<Candidate> candidates = new ArrayList<Candidate>();
	
	public ControlUnit(){
		this.status=true;
		this.TotalVotes=0;
		ballotPanel=new ControlPanel("Balot Section");
		resultPanel=new ControlPanel("Result Section");
		this.ballotPanel.button.add(new BallotButton(this,"Ballot"));
		this.ballotPanel.button.add(new Button("Total"));
		this.resultPanel.button.add(new Button("Result-I"));
		this.resultPanel.button.add(new Button("Result-II"));
		this.resultPanel.button.add(new Button("Close"));
		this.resultPanel.button.add(new Button("Clear"));
		
	}
	
  
	public boolean poll(){
		
		this.bu.switchState();
		
		return true;
	}
	
	
	
	
	
	
	
	
	

}
