import java.util.Scanner;
import java.util.ArrayList;


public class main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

    //PUNTO 1
    ArrayList<String> nomi = new ArrayList<>();
    nomi.add("simone");
    nomi.add("giorgi");
    nomi.add("franci");
    nomi.add("isra");
    nomi.add("bencex");
    for(String nome: nomi){
        System.out.println(nome);
    }

    //PUNTO 2
    grandezzaArreyList(nomi);
    
    //PUNTO 3
    ArrayList<Integer> numeri = new ArrayList<>();
    numeri.add(1);
    numeri.add(2);
    numeri.add(3);
    numeri.add(4);
    numeri.add(5);

    int somma = 0;
    for(int numero: numeri){
        somma += numero;
    }
    System.out.println(somma);

    //PUNTO 4
    System.out.println("Inserisci nome di persona:");
    String nomeInserito = input.nextLine().toLowerCase();

    int grandezzaLista = nomi.size();
    int count = 0;
    for(String parola: nomi){
        if(parola.equals(nomeInserito)){
            count++;
        }
    }

    if(count > 0){
        System.out.println(nomeInserito + " è presente nella lista data");
    }

    else{
        System.out.println(nomeInserito + " non è presente nella lista data");
    }

    //PUNTO 5
    System.out.println("Dalla lista data precedentemente, rimuovi un nome");
    String nomeRimosso = input.nextLine().toLowerCase();

    String daRimuovere = "";
    for (String parola : nomi) {
        if (nomeRimosso.equals(parola)) {
        daRimuovere = parola;
        break;
        }
    }

    if (daRimuovere != null) {
        nomi.remove(daRimuovere);
        System.out.println(nomeRimosso + " è stato rimosso.");
    } else {
        System.out.println(nomeRimosso + " non è presente nella lista.");
    }

    for (String nome: nomi) {
        System.out.println(nome);
    }
    

    }
    public static void grandezzaArreyList(ArrayList<String> nomi){
        int grandezza = nomi.size();
        System.out.println("Gli elementi all'interno dell'arreylist sono: " + grandezza);
    }
}
