package fuchimi;

import java.util.Scanner;

import fuchimi.Hand; 
import fuchimi.Paper;  
import fuchimi.Rock;  
import fuchimi.Scissors; 

public class FuchimiGameRulesTest{ 

public static Hand toHand(int input){
	switch(input){
	case 1:
		return new Rock();
	case 2:
		return new Paper();
	case 3:
		return new Scissors();
	case 4:
		return new Lizard();
	case 5:
		return new Spock();
	default:
		return null;
	}
}

 public static void main(String[] args) {  
  /**
   Hand hand1 = new Rock() ; 
   Hand hand2 = new Paper() ; 
   Hand hand3 = new Scissors() ; 
    
    
   System.out.println(hand1 + " beats " + hand1 + "? " + hand1.beats(hand1)) ; 
   System.out.println(hand1 + " beats " + hand2 + "? " + hand1.beats(hand2)) ; 
   System.out.println(hand1 + " beats " + hand3 + "? " + hand1.beats(hand3)) ; 
   System.out.println(hand2 + " beats " + hand1 + "? " + hand2.beats(hand1)) ; 
   System.out.println(hand2 + " beats " + hand2 + "? " + hand2.beats(hand2)) ;  
   System.out.println(hand2 + " beats " + hand3 + "? " + hand2.beats(hand3)) ;  
   System.out.println(hand3 + " beats " + hand1 + "? " + hand3.beats(hand1)) ; 
   System.out.println(hand3 + " beats " + hand2 + "? " + hand3.beats(hand2)) ;  
   System.out.println(hand3 + " beats " + hand3 + "? " + hand3.beats(hand3)) ; 
   */
   
   int input_player = 1;
   while(input_player != 0){
	   System.out.println("Enter 1 for Rock");
	   System.out.println("Enter 2 for Paper");
	   System.out.println("Enter 3 for Scissors");
	   System.out.println("Enter 4 for Lizard");
	   System.out.println("Enter 5 for Spock");
	   System.out.println("Enter 0 to Quit");
	   
	   Scanner in = new Scanner(System.in);
	   try{
		   input_player = in.nextInt();
	   } catch (java.util.InputMismatchException e){
		   System.err.println(e+"\n Please enter a number \n");
		   continue;
	   }
	   
	   
	   Hand hand_player = FuchimiGameRulesTest.toHand(input_player);
	   Hand hand_computer = FuchimiGameRulesTest.toHand((int) (Math.random() * (6-1) + 1));
	   
	   if(input_player == 0){
		   System.out.println("Quit Game \n");
		   break;
	   } else {
		   System.out.println("You chose "+hand_player);
		   System.out.println("Computer chose "+hand_computer);
		   
		   if(hand_player.beats(hand_computer) == null){
			   System.out.println("Your hand "+ hand_player + " equals "+hand_computer+"\n");
		   } else if(hand_player.beats(hand_computer)){
			   System.out.println("You won");
			   System.out.println("Your hand "+ hand_player + " beats "+hand_computer+"\n");
		   } else {
			   System.out.println("You lost");
			   System.out.println("Your hand "+ hand_player + " is beaten by "+hand_computer+"\n");
		   }
	   }
   }
   
} 

}