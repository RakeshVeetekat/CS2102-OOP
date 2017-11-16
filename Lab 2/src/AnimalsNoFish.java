interface IAnimal {
  boolean isNormalSize () ;
  boolean isDangerToPeople();
}

abstract class AbsAnimal implements IAnimal {
  int length ;
  
  AbsAnimal (int length) {
    this.length = length ;
  }  

  // determines whether this.length lies between given bounds
  boolean isLenWithin(int low, int high) {
    return low <= this.length && this.length <= high ;
  }
  
  // default method for animals that are not dangerous
  boolean isDangerToPeople() {
	  return false;
  }
  
}

class Dillo extends AbsAnimal {
  boolean isDead ;
  
  Dillo (int length, boolean isDead) {
    super(length) ;
    this.isDead = isDead ;
  }
  
  // determines whether Dillo is dead and longer than 60
  boolean canShelter() {
    return (this.isDead && this.length > 60);
  }
  
  // determines whether this dillo's length is between 2 and 3
  boolean isNormalSize () {
    return isLenWithin(2,3);
  }

}

class Boa extends AbsAnimal {
  
  String name ;
  String eats ;
   
  Boa (String name, int length, String eats) {
    super(length) ;
    this.name = name ;
    this.eats = eats ;
  }
  
  // determines whether this boa's length is between 5 and 10
  boolean isNormalSize () {
    return isLenWithin(5,10);
  }
  
  // determines whether a boa is dangerous
 boolean isDangerToPeople() {
	  return eats.equals("people");
  }
  
}

class Fish extends AbsAnimal{
    
	double salinity; 

    Fish (int length, double salinity) {
      super(length);
      this.salinity = salinity;
    }

    // determines if a fish's length is between 1 to 15
    boolean isNormalSize () {
      return isLenWithin(1,15);
    }

  }

  
class Shark extends Fish{
    
	  int attacks;
  
    Shark (int length, int attacks) {
      super(length,3.75);
      this.attacks = attacks;
    }
    
    // determines whether the shark is of normal size, above 6
    boolean isNormalSize() {
    	return length > 6;
    }
    
    // determines whether a shark is dangerous based on if it's attacked before
    boolean isDangerToPeople() {
    	return attacks > 0;
    }

  }



