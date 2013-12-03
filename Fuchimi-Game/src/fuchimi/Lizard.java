package fuchimi;

public class Lizard extends Hand{
	
	public String toString(){
		return "Lizard";
	}

	@Override
	
	public Boolean beats(Hand hand) {
		return hand.loseAgainst(this);
	}


	@Override
	protected Boolean loseAgainst(Rock rock) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected Boolean loseAgainst(Paper paper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Boolean loseAgainst(Scissors scissors) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected Boolean loseAgainst(Spock spock) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Boolean loseAgainst(Lizard lizard) {
		// TODO Auto-generated method stub
		return null;
	}
}

