package math;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		int num;
		int a;
		int b;
		float result;
		Scanner sc = new Scanner(System.in);
		Boolean reponse = true;
		
		while (reponse)
		{
			Calcul calcul = new Calcul();
			System.out.println("Choisir entre : ");
			System.out.println("[1] : Addition ");
			System.out.println("[2] : Soustraction");
			System.out.println("[3] : Multiplication");
			System.out.println("[4] : Division");
			num = sc.nextInt();

			switch(num)
			{
		  	case 1:
		  		System.out.println("Vous avez choisi l'addition");
		  		System.out.println("Saisissez le premier chiffre");
		  		a = sc.nextInt();
		  		System.out.println("Saisissez le second chiffre");
		  		b = sc.nextInt();
		  		result = calcul.addition(a, b);
		  		System.out.println(" "+a+" + "+b+" = "+result+" ");
		  		break;
		  	case 2:
		  		System.out.println("Vous avez choisi la soustraction");
		  		System.out.println("Saisissez le premier chiffre");
		  		a = sc.nextInt();
		  		System.out.println("Saisissez le second chiffre");
		  		b = sc.nextInt();
		  		result = calcul.substraction(a, b);
		  		System.out.println(" "+a+" - "+b+" = "+result+" ");
		  		break;
		  	case 3:
		  		System.out.println("Vous avez choisi la multiplication");
		  		System.out.println("Saisissez le premier chiffre");
		  		a = sc.nextInt();
		  		System.out.println("Saisissez le second chiffre");
		  		b = sc.nextInt();
		  		result = calcul.multiplication(a, b);
		  		System.out.println(" "+a+" x "+b+" = "+result+" ");
		  		break;
		  	case 4:
		  		System.out.println("Vous avez choisi la division");
		  		System.out.println("Saisissez le premier chiffre");
		  		a = sc.nextInt();
		  		System.out.println("Saisissez le second chiffre");
		  		b = sc.nextInt();
		  		result = calcul.div(a, b);
		  		System.out.println(" "+a+" / "+b+" = "+result+" ");
		  		break;
		  	default:
		  		System.out.println("NOP");
		  }
		  

		  
		  System.out.println("Voulez-vous réessayer ? (O/N)");
		  if (sc.nextLine() == "O"){
			  reponse = true;
		  } else {
			  reponse = false;
			  System.out.println("Au revoir…");
		  }
		}
		 
		


	}

}
