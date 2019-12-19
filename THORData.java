import java.io.*;
import java.util.*;
public class THORData{
  public static void main(String[] args){
    String[] bob = new String[4];
    int ammoCnt = 0;
    String[] most = new String[4];
    try{
      Scanner thorDat = new Scanner(new File("THORList.csv"));
      thorDat.nextLine();
      most = thorDat.nextLine().split(",");
      ammoCnt += Integer.parseInt(most[3]);
      int i = 0;
      for(i = 0; thorDat.hasNextLine(); i++){
        bob = thorDat.nextLine().split(",");
        ammoCnt += Integer.parseInt(bob[3]);
        if(Integer.parseInt(bob[3])> Integer.parseInt(most[3])){
          most[0] = bob[0];
          most[1] = bob[1];
          most[2] = bob[2];
          most[3] = bob[3];
        }
      }
      // System.out.println(thorDat.length);
    }catch(Exception e){
      System.out.println(e);
    }
    double percent = (Double.parseDouble(most[3])/ammoCnt)*100;
    System.out.println(most[0]);
    System.out.println(most[1]);
    System.out.println(most[2]);
    System.out.println(most[3]);
    System.out.println(percent+ "%");


  }
}
