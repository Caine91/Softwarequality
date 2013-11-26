package fuchimi;

import fuchimi.Hand; 
import fuchimi.Paper;  
import fuchimi.Rock;  
import fuchimi.Scissors; 

public class FuchimiGameRulesTest{ 


 public static void main(String[] args) {  
  
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
} 

}