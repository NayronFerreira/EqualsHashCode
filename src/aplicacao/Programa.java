package aplicacao;

import entidade.Cliente;

public class Programa {

	public static void main(String[]args) {
		
		String n1 = "Ingrid";
		String n2 = "Ingrid";
		
		Cliente c1 =  new Cliente("Tataia", "tataia@gmail.com");
		
		Cliente c2 =  new Cliente("Tataia", "tataia@gmail.com");
		
		System.out.println(n1==n2);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		
		
	}
}
