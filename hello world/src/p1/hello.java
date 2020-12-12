package p1;

import java.util.Scanner;

public class hello {

	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbe ca³kowita: ");
		int a=scanner.nextInt();
		System.out.println("Podaj liczbe ca³kowita: ");
		int b=scanner.nextInt();
		int licznik=1;
		int i;
			for ( i=a; b>licznik; i=i*a )
				licznik=++licznik;
			System.out.println(i);
		
//		System.out.println("Podaj liczbe ca³kowita: ");
//		int b=scanner.nextInt();
//		for (int i=a;i<=b; i++)
//			if ((i%5==0) && (i%3!=0 ))
//		System.out.println( i );
//		if (a>b)
//		{if (a>c)
//			System.out.println(a );
//		else
//			System.out.println( c);}
//		{if (b>c)
//			System.out.println( b);
//		else
//			System.out.println( c);
//		
//		}
		}
	}

