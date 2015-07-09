package onlinetest1;

public class Candidate {
	
	String name;
	Integer votes;
	String symbol;
	

	public Candidate(String n,String s){
		this.name=n;
		this.symbol=s;
		this.votes=0;
		
		
	}
	
	int addVotes(){
		this.votes++;
		return 1;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVotes() {
		return votes;
	}
	public void setVotes(Integer votes) {
		this.votes = votes;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	

	
	

}
