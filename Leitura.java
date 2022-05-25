//Aline Inoue Cerqueira - RA: 2142333

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{
	public String entDados(String s){
		System.out.println(s);

		BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));

		String c ="";

		try {
			c = dado.readLine();
		}
		catch(IOException e) {
			System.out.println("Houve um erro na entrada de dados!");
		}
			
		return c;
 	 }
}