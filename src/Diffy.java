public class Diffy {

  private int d1;
  private int d2;
  private int d3;
  private int d4;

  public Diffy(int diffy1, int diffy2, int diffy3, int diffy4) {
      this.d1 = diffy1;
      this.d2 = diffy2;
      this.d3 = diffy3;
      this.d4 = diffy4;
    }
    
  public boolean isZero() {  
     if (d1 == 0 && d2 == 0 && d3 == 0 && d4 == 0){
          return true;
      }
      else
      {
          return false;
      }
    }
    
  public void printDiffy(){
	    System.out.println(d1 + "\t" + d2 + "\t" + d3 + "\t" + d4);
    }
  

  Diffy next(){
		 int a,b,c,d;
		 a = Math.abs(d1 - d2);
		 b = Math.abs(d2 - d3);
		 c = Math.abs(d3 - d4);
		 d = Math.abs(d4 - d1);
		 
		 d1 = a;
		 d2 = b;
		 d3 = c;
		 d4 = d;
		 Diffy dify = new Diffy(a,b,c,d);
		 return dify;
	}

         
       
       
}
    
    

