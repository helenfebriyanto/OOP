package test;
import java.util.*;

public class Main{
  int x;
  Integer y=99;
  String name ="Budi";
  String sentence="Hello World!";
  //Array
  int[][] z = new int[10][9];

  
  ArrayList <Integer> a = new ArrayList<Integer>();
  
  HashMap<String, Integer> b = new HashMap<String, Integer>();
  
  public Main(){
    
    b.put("sfx", 99);
    b.put("bgm", 10);
    System.out.println(z.get("sfx"));
    
    a.add(7);
    a.add(5);
    a.add(4);
    a.add(90);
    for (Integer n : a){
     System.out.println(n);
    }
    System.out.println(a.get(0));
    
    //y.toString();
    // y.longValue();
    System.out.println(y.MAX_VALUE);
    //static function -> class+function
    x= Integer.parseInt("99996"); //parse ->bongkar structure nya 
    System.out.println(x);
    
    System.out.println(name.equals("budi"));
    System.out.println(name.compareTo("Dudi"));
    System.out.println(name == "Ludi");
    System.out.println(sentence.substring(4, 7));
    System.out.println(sentence.indexOf("H"));
    System.out.println(sentence.indexOf("Hello"));
    System.out.println(sentence.contains("hell"));
    //hash mapsss
    
  }
  
  public static void main(String[] args) {
    new Main();
  }
}