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
    /* 
    for(String nome: nomi){
        System.out.println(nome);
    }

    //PUNTO 2
    grandezzaArreyList(nomi);
    */
    //PUNTO 3
    ArrayList<Integer> numeri = new ArrayList<>();
    numeri.add(1);
    numeri.add(2);
    numeri.add(3);
    numeri.add(4);
    numeri.add(5);

    /* 
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
    */
    //PUNTO 6  
    /* 
    invertiNumeri(numeri);
    for(int numero: numeri){
        System.out.println(numero);
    }
        */

    //PUNTO 7
    /* 
    numeri.set(1, 4);
    rimuoviDuplicati(numeri);
    for(int numero: numeri){
        System.out.println(numero);
    }
    */

    ArrayList<Integer> pari = numeriInteri(numeri);
    for (int n : pari) {
        System.out.println("Numeri pari: " + n);
    }
    }
    public static void grandezzaArreyList(ArrayList<String> nomi){
        int grandezza = nomi.size();
        System.out.println("Gli elementi all'interno dell'arreylist sono: " + grandezza);
    }

    //PUNTO 6
    public static void invertiNumeri(ArrayList<Integer> lista){
        int variabile = 0;
        int numero = 0;
        variabile = lista.size();
        for(int i = 0; i < variabile; i++) {
            numero = lista.get(i);
            lista.add(numero);
            lista.remove(i);
        }
    }

    public static void rimuoviDuplicati(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            int numeroCorrente = lista.get(i);
            for (int j = i + 1; j < lista.size(); j++) {
                if (numeroCorrente == lista.get(j)) {
                    lista.remove(j);
                    j--;
                }
            }
        }
    }    

    public static ArrayList<Integer> numeriInteri(ArrayList<Integer> lista){
        ArrayList<Integer> numeri_interi = new ArrayList<>();
        for(int numeri: lista){
            if(numeri % 2 == 0){
                numeri_interi.add(numeri);
            }
        }
        return numeri_interi;
    }
    
    }

