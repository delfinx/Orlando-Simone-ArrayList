import java.util.Scanner;
import java.util.ArrayList;

public class main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

    ArrayList<String> nomi = new ArrayList<>();
    nomi.add("Simone");
    nomi.add("Giorgi");
    nomi.add("Franci");
    nomi.add("Isra");
    nomi.add("Bencex");
    for(String nome: nomi){
        System.out.println(nome);
    }

    grandezzaArreyList(nomi);
    
    
    }
    public static void grandezzaArreyList(ArrayList<String> nomi){
        int grandezza = nomi.size();
        System.out.println("Gli elementi all'interno dell'arreylist sono: " + grandezza);
    }
}
