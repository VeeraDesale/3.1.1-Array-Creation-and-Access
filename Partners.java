/*
 * Activity 3.1.1
 */
public class Partners
{
  public static void main(String[] args)
  {    
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    String[] partners = new String[7];

    //Problem 13
    System.out.println(partners[0]);

    //Problem 14
    partners[1] = "Dia";
    partners[3] = "Ellie";
    partners[5] = "Fay";

    //Problem 15
    System.out.println(days[1] + ": " + partners[1]);
    System.out.println(days[3] + ": " + partners[3]);
    System.out.println(days[5] + ": " + partners[5]);

    //Problem 16
    String[] friendPartners = partners;

    //Problem 17
    System.out.println(days[1] + ": " + friendPartners[1]);
    System.out.println(days[3] + ": " + friendPartners[3]);
    System.out.println(days[5] + ": " + friendPartners[5]);
  }
}
