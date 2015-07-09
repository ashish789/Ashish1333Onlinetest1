package onlinetest1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectronicVotingMachine evm=new ElectronicVotingMachine(5);
		evm.addCandidate("Ashish", "&");
		evm.addCandidate("Tanvi", "@");
		evm.addCandidate("Sairaj", "!");
		evm.addCandidate("Sohan", "#");
		evm.addCandidate("Mohini", "^");
		
		evm.createPanelBallot();
		//System.out.println(evm.cu.ballotPanel.button.get(2).name);
		
		evm.cu.ballotPanel.button.get(1).pressed();
		
	
		
		for(int i=0;i<5;i++){
			System.out.print(i+1);
			System.out.println("  "+evm.candidates.get(i).name+"  "+evm.candidates.get(i).symbol);
			
		}
		evm.bu.vpanel.voteButtons.get(0).pressed();
		evm.cu.ballotPanel.button.get(1).pressed();
		
		evm.bu.vpanel.voteButtons.get(1).pressed();
		evm.cu.ballotPanel.button.get(1).pressed();
		
		evm.bu.vpanel.voteButtons.get(0).pressed();
		evm.cu.ballotPanel.button.get(1).pressed();
		
		evm.bu.vpanel.voteButtons.get(1).pressed();
		evm.cu.ballotPanel.button.get(1).pressed();
		
		
		evm.bu.vpanel.voteButtons.get(3).pressed();
		evm.cu.ballotPanel.button.get(1).pressed();
		
		evm.bu.vpanel.voteButtons.get(0).pressed();
		evm.cu.ballotPanel.button.get(1).pressed();
		
		evm.bu.vpanel.voteButtons.get(4).pressed();
		evm.cu.ballotPanel.button.get(1).pressed();

		evm.displayVotes();
		evm.displayResult();
		
		
		
	}

}

