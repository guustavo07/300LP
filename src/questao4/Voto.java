package questao4;
import java.util.Scanner;

public class Voto {
	    public static void main(String args[]) {
	        int mediaIdade=0, idade, contMenor=0, contMedia=0;
	        double mediaMenor=0;
	        Scanner ler = new Scanner(System.in);
	        for(int i=0; i<10;i++) {
	        	System.out.println("Informe a idade");
	        	idade=ler.nextInt();	        	
	        	if(idade<16){
	        		System.out.println("Não pode votar");
	        		contMenor++;
	        		contMedia+=idade;
	        	}else if(idade >15 && idade < 18){
	        		System.out.println("Voto facultativo");
	        		contMenor++;
	        		contMedia+=idade;
	        	}else if(idade>65){
	        		System.out.println("Voto facultativo");
	        		contMedia+=idade;
	        	}else {
	        		System.out.println("Voto Obrigatório");
	        	contMedia+=idade;
	        	}
	        	mediaIdade=contMedia/10;
	        	mediaMenor=contMenor/10;
	        }
	       
	        System.out.println("A media das idades é: "+mediaIdade);
	        System.out.printf("A media é %.2f",mediaMenor);

	    }
	}
