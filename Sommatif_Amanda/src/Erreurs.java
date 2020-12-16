
public class Erreurs {

	public static void main(String[] args) //Il faut mettre 'static'
	{
		System.out.println(saluerAmi("John"));
	}
	
	/*
	 * Méthode permettant de saluer un ami en 
	 * utilisant son nom
	 */	
	public static String saluerAmi(String a) //Il faut mettre 'static'
	{
		String message = "Bonjour mon ami " + a; 
		//On a besoin d'un espace après ami, si non il imprime "Bonjour mon amiJohn"
		return message;
	}
	//Erreur avec les accolades: La methode saluerAmi ne devrait pas être dans main, il est une methode spéparé
}
