public class THORData{
  public void String(){
    String[] head = new String[294];
    try{
      Scanner header = new Scanner(new File("THORList.csv"));
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
  public static void main(String[] args){

  }
}
