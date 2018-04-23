import java.util.Scanner;

class TestMultipleCatchBlock{  
  public static void main(String args[]){  
  try {
	  int []arr=new int [10];
	  int a,b;
	  Scanner input = new Scanner(System.in);
	  a=input.nextInt();
	  b=input.nextInt();
	  int res= a/b;
	  arr[10]=a/b;

	  System.out.println(res);
  }
  catch(ArrayIndexOutOfBoundsException e) {
	  System.out.println(e.getMessage());
  }
  catch(NullPointerException e) {
System.out.println(e.toString());
  }
  catch (RuntimeException e) {
	  System.out.println(e.toString());
  }
  catch(Exception e) {
	  System.out.println(e.toString());
  }
 }  
}  

