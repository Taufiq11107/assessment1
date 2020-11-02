import java.util.Scanner;

    public class Soal3{
	          public static void main(String[] args){
			       Scanner chan = new Scanner(System.in);
				   
				       int bilanganBulat1 = chan.nextInt();
					   int bilanganBulat2 = chan.nextInt();
					   int bilanganBulat3 = chan.nextInt();
					   
					   int sisaBilanganBulat1, sisaBilanganBulat2, sisaBilanganBulat3;
					   int hasilBagi1, hasilBagi2, hasilBagi3;
					        
							sisaBilanganBulat1 = bilanganBulat1 / 100;
							
							sisaBilanganBulat2 = bilanganBulat2 / 10;
							hasilBagi2 = sisaBilanganBulat2 % 10;
							
							sisaBilanganBulat3 = bilanganBulat3 % 100;
							hasilBagi3 = sisaBilanganBulat3 % 10;
							
					System.out.println(sisaBilanganBulat1 + hasilBagi2 + hasilBagi3);
				}
		}		