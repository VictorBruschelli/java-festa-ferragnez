package com.ferragnez.party;
import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		/*Nel programma bisogna:
			creare e inizializzare l’array contenente i nomi degli invitati
			chiedere all’utente come si chiama verificare che il nome sia presente nella lista
			lasciarlo entrare o rispedirlo cortesemente da dove è venuto*/
		
		String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
		"Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		Scanner valoreUtente = new Scanner(System.in);
		String nomeUtente;
		
		System.out.println("inserisci il tuo nome per verificare se sei incluso nella lista: ");
		nomeUtente = valoreUtente.nextLine();
		
		boolean invitato = false;
		for (int i = 0; i < invitati.length; i++) {

			if (nomeUtente.equalsIgnoreCase(invitati[i])) {
				invitato = true;
				break;
			}
		}
				if (invitato) {
					System.out.println("puoi accedere alla festa " + nomeUtente); 
			}else {
				System.out.println("mi dispiace ma non sei nella lista, ritorna pure da dove sei venuto");
			}
			
		}
		
		}
		

