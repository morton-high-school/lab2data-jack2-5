import java.util.*;
import java.io.*;
public class CerealInfo{
  public CerealInfo(){
    System.out.println();
  }
  public void String(){
    String[] head = new String[20];
    try{
      Scanner header = new Scanner(new File("Cereal.csv"));
      head = header.nextLine().split(",");
      while(header.hasNextLine()){
        Scanner inc = new Scanner(header.nextLine());
        inc.useDelimiter(",");
        for(int i = 0; inc.hasNext();i++){
          System.out.println(head[i]+ ": "+inc.next());
        }
      }
    }catch(Exception e){
      System.out.println(e);
    }
  }

  public void Difference(){
    String[] head = new String[16];
    try{
      Scanner header = new Scanner(new File("Cereal.csv"));
      head = header.nextLine().split(",");
      String[] home = new String[head.length];
      String[] current = new String[13];
      String[][] shelves = new String[3][13];
      int round = 0;
      System.out.println("start");
      while(header.hasNextLine()){
        System.out.println("line: "+ round);
        Scanner inc = new Scanner(header.nextLine());
        inc.useDelimiter(",");
        int i = 0;
        inc.next();
        inc.next();
        for(i = 0; inc.hasNext();i++){
          //
          current[i] = inc.next();
           // System.out.println("next: "+ current[i]);
        }
        int level = Integer.parseInt(current[i-4]);
        System.out.println(current[i-4]);
        if(round > 0){
          for(int k = 0; k < current.length; k++){
            // System.out.println("add: "+ round);
            // System.out.println("shelf pre: "+ shelves[level-1][k]);
            try{
              shelves[level-1][k] = String.valueOf(Double.parseDouble(current[k]) +Double.parseDouble(shelves[level-1][k]));
            }catch(Exception e){
              System.out.println(e);

            }
            /                       / System.out.println("shelf: " + shelves[level-1][k]);
            // System.out.println("current: " +current[k]);
          }
        }
        else{
          for(int k = 0; k < current.length; k++){
            // System.out.println("start: "+ round);
            shelves[level-1][k] = current[k];
          }
        }
        round++;
      }
      for(int y = 0; y < shelves.length; y++){
        for(int w = 0; w < shelves[y].length; w++){
          System.out.print(y + " " +shelves[y][w]);
        }
      }
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
