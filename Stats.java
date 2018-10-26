import java.util.*;
public class Character{
  public static Scanner scan = new Scanner(System.in);
  public static ArrayList<String> Char_items = new ArrayList<>();
  public static HashMap<String, Integer> Char_stats = new HashMap<>();  //strength, intelligence, stealth, health, hydration, food

  public static void display(){
    for(String t:Char_stats.keySet()){
      System.out.println(Char_stats.get(t));
    }
  }
  public static void change_stats(String name, int value){
    Char_stats.get(name) += value; //"name" is underlined in red saying it has an error please help fix
  }

  public static void main(String[]args){
    //input tests below
    Char_stats.put("strength", 1);
    Char_stats.put("intelligence", 1);
    Char_stats.put("stealth", 1);
    Char_stats.put("health", 1);
    Char_stats.put("hydration", 10); // goes down
    Char_stats.put("food", 20); // goes down
    display();
    String statName = scan.nextLine();
    int statValue = scan.nextInt();
    change_stats(statName, statValue);
  }
}
