/*
 * Activity 3.1.1
 */
public class GoalKeeper
{
  public static void main(String[] args)
  {    
    //Problem 4: int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    int[] goals = {1};
    int high = 0;

    //Problem 2
    for (int i = 0; i < goals.length; i++){
        if (goals[i] > high){
            high = goals[i];
        } 
    }

    System.out.println(high);


    //Problem 3
    goals[2] = 1;
    System.out.println(goals[2]);
  
  }
}