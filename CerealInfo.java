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
}
