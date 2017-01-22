/**
 * Auto Generated Java Class.
 */
public class CALCULATOR {
  
  public static void main (String[] args){
    
 if(args[0].equals("add")){
   double x = Double.parseDouble(args[1]);
   double y = Double.parseDouble(args[2]);
     System.out.println(x+y);
 }  
 else if (args[0].equals("substract")){
   double x = Double.parseDouble(args[1]);
   double y = Double.parseDouble(args[2]);
     System.out.println(x-y);
}
 else if (args[0].equals("multiply")){
   double x = Double.parseDouble(args[1]);
   double y = Double.parseDouble(args[2]);
     System.out.println(x*y);
 }
  }
}
