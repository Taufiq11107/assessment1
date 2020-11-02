import java.util.Scanner;
public class Soal2{

    public static void main(final String[] args){
	  //Kerjakan soalnya di sini
	  Scanner dira = new Scanner(System.in);
	  int hasil = 0, counter = 0;
	  double rand;
	  
	  while(counter != 3){
	    rand = 1 + (Math.random() *121);
		  if((int)rand % 4 == 0){
		    System.out.println((int)rand);
			  counter++;
			}
		}
	}
}