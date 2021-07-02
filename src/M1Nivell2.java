
public class M1Nivell2 {

	public static void main(String[] args) {
		// M1 Nivell 2

//Declara una variable double. Assigna-li un valor amb 4 decimals
		
		double numero1 = 4.5678;
		
//Declara variables de tipus: int, float i string
		
		int numero2;
        float numero3;
        String numero4;
        
/*Fes un "cast" de la variable double a cada una de les variables 
que has creat anteriorment per inicialitzar-les i pinta-les per pantalla.*/
				
        numero2 = (int)numero1;
        numero3 = (float)numero1;
        numero4 = Double.toString(numero1);
        
        System.out.println(numero1 + " double");
        System.out.println(numero2 + " int");
        System.out.println(numero3+ " float");
        System.out.println(numero4+ " string");

	}

}
