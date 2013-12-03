package fuchimi;

public class Paper extends Hand{
	
	public String toString(){
		return "Paper";
	}

	@Override
	
	public Boolean beats(Hand hand) {
		return hand.loseAgainst(this);
	}


	@Override
	protected Boolean loseAgainst(Rock rock) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Boolean loseAgainst(Paper paper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Boolean loseAgainst(Scissors scissors) {
		// TODO Auto-generated method stub
		return true;
	}
}
