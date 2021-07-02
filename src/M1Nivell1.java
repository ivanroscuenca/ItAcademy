
public class M1Nivell1 {

	public static void main(String[] args) {
		//FASE 1
		
		//Crea tres variables string e inicialitzales amb les dades pertinents(nom,cognom1,cognom2)		
				
		String nom = "Ivan";
		String cognom1 = "Ros";
		String cognom2 = "Cuenca";

		//Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any).

		int dia = 6;
		int mes = 6;
		int any = 1981;

		/*Mostra per pantalla les variables string concatenant-les en aquest ordre 
		 (cognom1 + cognom2, + nom). */

		System.out.println(cognom1 + " " + cognom2 + "," + " " + nom );

		/*Mostra per pantalla les variables int concatenant-les amb “/” 
		  entre cada una d’elles*/

		System.out.println(dia + "/" + mes + "/"  + any );

		System.out.println("");
			//FASE 2

		//Sabent que l’any 1948 es un any de traspàs:

		//Creeu una constant amb el valor de l’any (1948).
		 
		 final int anyTraspas1 = 1948;
		 
		 
		//Creeu una variable que guardi cada quan hi ha un any de traspàs
		 
		   int anyTraspasos = 0;
		 
		/*Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i
		emmagatzemeu el valor resultant en una variable.
		Mostreu per pantalla el resultat del càlcul*/
		   
		   System.out.print("Numero d'anys de traspàs desde " + anyTraspas1 + " fins " + any + ": ");
		   for(int i = anyTraspas1; i <= any; i=i+4){
		           anyTraspasos++;}
		           System.out.print(anyTraspasos);
		           System.out.println("");
		   
		//Feu servir un bucle for, mostrant tots aquests anys.*/
		           
		   System.out.println("Tots els anys de traspàs de 1948 fins a " + any + ":");
		   for (int i = 1948; i <= any; i=i+4) {
		           System.out.print(i + " ");
		           }
		   System.out.println("");
		   //FASE 3
		           
		//Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és.
		   System.out.println("");  
		 boolean ComprovacioAnyTraspas;
		 
		 if ((any % 4 == 0)) {
			 ComprovacioAnyTraspas = true;
		 }
			else {
				ComprovacioAnyTraspas = false;
			}
		 
		//Creeu dues variables string per guardar les frases
		 
		String fraseTraspasTrue = "El meu any de naixement: " + any + " és de traspàs.";
		String fraseTraspasFalse = "El meu any de naixement: " + any + " no és de traspàs.";

		//En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui,
		 
		 if (ComprovacioAnyTraspas) {
			 System.out.println(fraseTraspasTrue);
		 	}	 
		//en cas de ser falsa mostrareu la frase pertinent. 
		 else { 
			 System.out.println(fraseTraspasFalse);
		 	  }
		 System.out.println("");
		 	//FASE 4
		 /*Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i un altre on juntareu la data de naixement separada per “/” (tot en una variable). Mostreu per consola les variables del nom complet, 
		 la data de naixement i si l’any de naixement es de traspàs o no.*/
		 
		 String nomComplet = "El meu nom complet és " + nom + " " + cognom1 + " " + cognom2 ;
		 String dataNaixament = "Vaig nèixer el " + dia + "/" + mes + "/"  + any ;
		 
		 System.out.println(nomComplet+ "\n" + dataNaixament);
		 
		 if (ComprovacioAnyTraspas) {
			 System.out.println(fraseTraspasTrue);
		 	}	  
		 else { 
			 System.out.println(fraseTraspasFalse);
		 	  }
	}

}
