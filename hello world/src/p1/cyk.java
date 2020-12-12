package p1;
import java.util.Scanner;
import java.util.Random;
public class cyk {

	public static void main(String[] args) {
		int tab[]=new int[30];
	   Random r = new Random();
	   int  suma=0;
	  
	   for(int i=0;i<tab.length;i++)
		   tab[i]=r.nextInt(20)+10;
	   int  max=tab[0];
	   int  min=tab[0];
	   
	   for(int i=0; i<tab.length;i++){
	
		   suma += tab[i];
		   if (tab[i]>max)
		   max =tab[i];
		   if (tab[i]<min)
			   min =tab[i];
		   
		   
		   System.out.println(tab[i]);
	   }
	   System.out.println("suma równa sie " +suma);
	   System.out.println("max równa sie " +max);
	   System.out.println("min równa sie " +min);
	   System.out.println("nowa linijka");
	}

}
