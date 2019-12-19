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
      double[] current = new double[13];
      double[][] shelves = new double[3][13];
      int[] amount = new int[3];
      int round = 0;
      while(header.hasNextLine()){
        Scanner inc = new Scanner(header.nextLine());
        inc.useDelimiter(",");
        int i = 0;
        inc.next();
        inc.next();
        for(i = 0; inc.hasNext();i++){
          current[i] = inc.nextDouble();
        }
        int level = (int)current[9];
        amount[level-1] += 1;
        if(round > 0){
          for(int k = 0; k < current.length; k++){
            try{
              shelves[level-1][k] = current[k] +shelves[level-1][k];
            }catch(Exception e){
              System.out.println(e);
            }
          }
        }
        else{
          for(int k = 0; k < current.length; k++){
            shelves[level-1][k] = current[k];
          }
        }
        round++;
      }
      for(int j = 0; j < 3;j++){
        System.out.println("\nshelf: "+ j);
        for(int w = 0; w < 13; w++){
          System.out.println(head[w+2]+ " "+ shelves[j][w]/amount[j]+ " ");
        }
      }
    }catch(Exception e){
      System.out.println(e);
    }

  }
}
