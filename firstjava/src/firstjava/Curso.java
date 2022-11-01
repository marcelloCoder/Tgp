package firstjava;

public class Curso {

	public static void main(String[] args) {
		
		double nota1 = 70;
		double nota2 = 90;
		double nota3 = 97;
		String nome = "Marcello";
		
		
		double mediaFinal = (nota1 + nota2 + nota3)/3;
		
		/*if(mediaFinal >= 70 && nome.equals("Marcello")) {
			System.out.println(" A = " + mediaFinal);
		}
		
		else {
			System.out.println(" B = " + mediaFinal);
		}*/
		
		/*Operadores ternários*/
		
		/*String saidaResultado = mediaFinal >= 70 ? "A" : (mediaFinal >= 40 && mediaFinal <= 69) ? "B":"Reprovado";
		
		System.out.println(saidaResultado);*/
		
		if (mediaFinal >=50) {
			if (mediaFinal >= 70) {
				System.out.println("C");
				
			}else {
				System.out.println("D");
			}
		}else {
			System.out.println("F");
		}

	}

}
