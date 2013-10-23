import java.util.Scanner;

public class DiffyDriver {
	
private static int d1;
private static int d2;
private static int d3;
private static int d4;
private static Scanner console;
  public static void main (String[] args) {
	  
	console = new Scanner(System.in);
    System.out.println("Enter four integer initial values. Separate each one by a space: ");
    d1 = console.nextInt();
    d2 = console.nextInt();
    d3 = console.nextInt();
    d4 = console.nextInt();
    
    Diffy test = new Diffy (d1, d2, d3, d4);
    
    while (test.isZero() == false){
    	test.next(); 
    	test.printDiffy();
    	
    }
    
    
    
    
    
    
  }
}