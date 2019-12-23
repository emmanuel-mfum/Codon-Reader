import javax.swing.JOptionPane; // import appropriate classes
import java.util.Scanner;
public class CondonReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner console = new Scanner(System.in); // creates a Scanner object
		 JOptionPane.showMessageDialog(null, "Welcome to the Codon Reader"); // Display to the user a welcoming message
		 String codon = " "; // initialize the String variable to an empty string
		 int  execution;



	do {
		 codon = JOptionPane.showInputDialog("Please type the codon" + "\n"+ "The codon must be three characters long and include the letters A,G,U and C");

		 switch(codon) { // the switch checks the value of the String variable named codon against all the follwing cases

		 case "UUC":
		 case "uuc":
		 case "UUU":
		 case "uuu":
			 		System.out.println("Phenylalanine - (Phe)");
			 		break;
		 case "UUA":
		 case "uua":
		 case "UUG":
		 case "uug":
		 case "CUU":
		 case "cuu":
		 case "CUC":
		 case "CUA":
		 case "cua":
		 case "CUG":
		 case "cug":
			 		System.out.println("Leucine - (Leu)");
			 		break;
		 case "UCU":
		 case "ucu":
		 case "UCC":
		 case "ucc":
		 case "UCA":
		 case "uca":
		 case "UCG":
		 case "ucg":
		 case "AGU":
		 case "agu":
		 case "AGC":
		 case "agc":
			 		System.out.println("Serine - (Ser)");
			 		break;
		 case "UAU":
		 case "uau":
		 case "UAC":
		 case "uac":
			 		System.out.println("Tyrosine - (Tyr)");
			 		break;
		 case "UAA":
		 case "uaa":
		 case "UAG":
		 case "uag":
		 case "UGA":
		 case "uga":
			 		System.out.println("Stop codon");
			 		break;
		 case "UGU":
		 case "ugu":
		 case "UGC":
		 case "ugc":
			 		System.out.println("Cysteine - (Cys)");
			 		break;
		 case "UGG":
		 case "ugg":
		 			System.out.println("Tryptophan - (Trp)");
		 			break ;
		 case "CCU":
		 case "ccu":
		 case "CCC":
		 case "ccc":
		 case "CCA":
		 case "cca":
		 case "CCG":
		 case "ccg":
		 			System.out.println("Proline - (Pro)");
		 			break;
		 case "CAU":
		 case "cau":
		 case "CAC":
		 case "cac":
		 			System.out.println("Histidine - (His)");
		 			break;
		 case "CAA":
		 case "caa":
		 case "CAG":
		 case "cag":
	 				System.out.println("Glutamine - (Gln)");
	 				break;
		 case "CGU":
		 case "cgu":
		 case "CGC":
		 case "cgc":
		 case "CGA":
		 case "cga":
		 case "CGG":
		 case "cgg":
		 case "AGA":
		 case "aga":
		 case "AGG":
		 case "agg":
					System.out.println("Arginine - (Arg)");
					break;
		 case "AUU":
		 case "auu":
		 case "AUA":
		 case "aua":
		 case "AUC":
		 case "auc":
					System.out.println("Isoleucine - (Ile)");
					break;
		 case "AUG":
		 case "aug":
					System.out.println("Methionine - (Met) (Start codon)");
					break;
		 case "ACU":
		 case "acu":
		 case "ACC":
		 case "acc":
		 case "ACA":
		 case "aca":
		 case "ACG":
		 case "acg":
					System.out.println("Threonine - (Thr)");
					break;
		 case "AAU":
		 case "aau":
		 case "AAC":
		 case "aac":
					System.out.println("Asparagine - (Asn)");
					break;
		 case "AAA":
		 case "aaa":
		 case "AAG":
		 case "aag":
					System.out.println("Lysine - (Lys)");
					break;
		 case "GUU":
		 case "guu":
		 case "GUC":
		 case "guc":
		 case "GUA":
		 case "gua":
		 case "GUG":
		 case "gug":
					System.out.println("Valine - (Val)");
					break;
		 case "GCU":
		 case "gcu":
		 case "GCC":
		 case "gcc":
		 case "GCA":
		 case "gca":
		 case "GCG":
		 case "gcg":
					System.out.println("Alanine - (Ala)");
					break;
		 case "GAU":
		 case "gau":
		 case "GAC":
		 case "gac":
					System.out.println("Aspartate - (Asp)");
					break;
		 case "GAA":
		 case "gaa":
		 case "GAG":
		 case "gag":
					System.out.println("Glutamate - (Glu)");
					break;
		 case "GGU":
		 case "ggu":
		 case "GGC":
		 case "ggc":
		 case "GGA":
		 case "gga":
		 case "GGG":
		 case "ggg":
					System.out.println("Glycine - (Gly)");
					break;
		 default:
				System.out.println("Wrong input"); //if the input doesn't correspond to any of the preceding cases, the sentence "Wrong input" is printed
							          


		 	}

		 System.out.println("Do you want to continue ? Enter 1 to continue or enter anything else to stop"); // whatever the input, the user is prompted for a decision, to continue or not
		 execution = console.nextInt();


	 }while(execution == 1); // the do...while loop will be execute at least once, but will only continue if the integer variable execution is equal to 1

	  System.out.print("You have exited the Codon Reader Program"); // Exit message

	  console.close();

   }

}
