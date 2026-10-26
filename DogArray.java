/*
 * Activity 3.1.1
 */
public class DogArray
{
  public static void main(String[] args)
  {
    //Problem 20
    Dog[] myDogs = {new Dog("Milo"), new Dog("Buddy"), new Dog("Puppy")};
    Dog[] neighborsDogs = new Dog[2];
    
    //Problem 21
    System.out.println(myDogs[0].getName());
    System.out.println(myDogs[1].getName());
    System.out.println(myDogs[2].getName());

    //Problem 22
    neighborsDogs[0] = new Dog("Bella");
    neighborsDogs[1] = new Dog("Stella");
    System.out.println(neighborsDogs[0].getName());
    System.out.println(neighborsDogs[1].getName());

    //Problem 24
    Dog[] friendsDogs = {new Dog("Lady"), new Dog("Tramp")};
    System.out.println(friendsDogs[0] + " and " + friendsDogs[1]);

    //Problem 25 and 26
    //neighborsDogs = {new Dog("Cinnamon"), new Dog("Mocha")}; // error
    //The error with this line is that the type of the neighborsDogs variable was not stated. The correct way to write it would be Dog[] neighborsDogs.

    //Problem 27 and 28
    //neighborsDogs[2] = new Dog("Cocoa"); // error
    //The error here is that neighborsDogs only has two elements at index 0 and 1. An index 2 does not exist, so there will be an index out of bounds error.

    //Problem 29 and 30
    //neighborsDogs = new Dog[3];
    System.out.println(neighborsDogs[0].getName()); // error
    System.out.println(neighborsDogs[1].getName()); // error
    //The problem is that the getName() function can't be used since each position of neighborsDogs is null.
  }
} 
