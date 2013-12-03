package fuchimi;


public abstract class Hand {
	
	public abstract Boolean beats(Hand hand);
	protected abstract Boolean loseAgainst(Rock rock);
	protected abstract Boolean loseAgainst(Paper paper);
	protected abstract Boolean loseAgainst(Scissors scissors);
	protected abstract Boolean loseAgainst(Spock spock);
	protected abstract Boolean loseAgainst(Lizard lizard);
}
