/*
* @Author : Amanda Tishler
* @Date : Dec. 16, 2020
* @Nom du programme : Sommatif_moyenneImpairs
* @Description : Programme permettant d'utiliser une methode pour touver 
* la moyenne des nombres impairs contenus dans un tableau de 20 nombres entiers 
* générés au hasard.
*/

public class Sommatif_2 {

	public static void main(String[] args) 
	{
		//Tableau de 20 nombres entiers générés au hasard
		int [] myTab = new int[20];
		for(int i = 0; i < myTab.length; i++)
		{
			myTab[i]=(int)(Math.random()*(i+1));	
		}

		//Afficher la moyenne des nombres impairs du tableau d'entiers
		System.out.println(moyenneImpairs(myTab));
	}
	
	static double moyenneImpairs(int [] a)
	{
		int somme = 0; ////variable qui servira pour la valeur de la somme
		for(int i = 0; i< a.length; i++)
		{
			if(a[i] % 2 != 0) //Si le reste de a[i]/2 ≠ 0
			somme+=a[i]; 	  //somme = somme + a[i]
		}
		double moy = (double)somme/a.length; //trouver la moyenne
		return moy;
	}

}
