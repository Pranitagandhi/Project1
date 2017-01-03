
public class Cozawozaloza {

	public static void main(String[] args) {
		
			 for (int x = 1; x <= 110; x +=1) {
				  if (x % 3 == 0 && x % 5 ==0 && x % 7 ==0) 
				  {
			            System.out.print(" CozaLozaWoza");
			      }	
				  else  if (x % 3 == 0 && x % 5 == 0) 
				  {
			            System.out.print(" CozaLoza");
			      }
				  else if (x % 3 == 0 && x % 7 ==0) 
				  {
			            System.out.print(" CozaWoza");
			       }
				  else if (x % 5 == 0 && x % 7 == 0 )
				  {
			            System.out.print(" LozaWoza");
			       }
				  else if (x % 3 == 0 ) 
				  {
			            System.out.print(" Coza");
			      }
				  else if (x % 5 == 0)
				  {
			            System.out.print(" Loza");
			      }
				  else if (x % 7 == 0)
				  {
			            System.out.print(" Woza");
			      }
				  else if (x % 3 != 0 && x % 5 != 0 && x % 7 != 0) 
				  {
			            System.out.print(" " + x);
				  }


			        if (x % 11 == 0) {
			            System.out.println();
			        }
			 }
		}



	}


