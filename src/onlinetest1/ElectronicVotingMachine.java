package onlinetest1;

import java.util.ArrayList;
import java.util.List;

public class ElectronicVotingMachine {
	
	List<Candidate> candidates = new ArrayList<Candidate>();
	BallotUnit bu;
	ControlUnit cu;
	
	public ElectronicVotingMachine(Integer no){
		bu=new BallotUnit(no);
		cu=new ControlUnit();
		bu.cu=cu;
		cu.bu=bu;
		
	}
	
	void addCandidate(String name,String symbol){
		this.candidates.add(new Candidate(name,symbol));
	
	}
	
	void createPanelBallot(){
		for(int i=0;i<bu.NumberOfCandidates;i++){
			bu.vpanel.voteButtons.get(i).c=this.candidates.get(i);
			
		}
		
		
	}
	
	
	boolean resetCounter(){
		this.cu.TotalVotes=0;
		for(int i=0;i<bu.NumberOfCandidates;i++){
		this.candidates.get(i).setVotes(0);
		}
		
		return true;
		
	}
	
	void displayVotes(){
		System.out.println("The Current Votes Are ="+this.cu.TotalVotes);
		
	}
	
	
	void displayResult(){
		System.out.println("The Result Are");
		for(int i=0;i<this.bu.NumberOfCandidates;i++){
			System.out.println(this.candidates.get(i).name+" : Votes= "+this.candidates.get(i).votes);
			
			
			
		}
		
		
	}
	
	
	
	
}
