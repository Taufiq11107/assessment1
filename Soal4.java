import java.util.Scanner;

  public class Soal4{
     public static void main(String[] args){
       Scanner chan = new Scanner(System.in);
	   int input = chan.nextInt();
	   input = input + 8;
	   int output = 0;
	   boolean kondisi = true;
	   int gelombang = 0;
	   int k1 = 0;
	   int k2 = 0;
	   int k3 = 0;
	 
	   while(kondisi){
	    gelombang = gelombang + 1;
	    input = input - 8;
	    if(input < 8){
	       output = output % 8;
	  }else{
	       output = 8;
  	  }
  	  System.out.println("K" + gelombang + "berangkat dengan" + output + " penumpang ");
	
	  switch(gelombang){
	   case 1:
	      k1++;
	      break;
	   
	   case 2:
	      k2++;
	      break;
		  
	   case 3:
	      k3++;
	      break;
	  }
	  
	  if(gelombang == 3){
	     gelombang = 0;
	  }
	  if(input <= 8){
	     kondisi = false;
 	  }
    }
    System.out.println("\nTrip K1 adalah " + k1);
    System.out.println("Trip K2 adalah " + k2);
    System.out.println("Trip K3 adalah " + k3);
    System.out.println("Total Trip adalah " + (k1 + k2 + k3));
   }
  }