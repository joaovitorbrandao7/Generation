package Familia28;

public class ClienteTeste {

	public static void main(String[] args) {

		cliente cl1 = new cliente("João Vitor", "3254677643","Itaqua", "11941217032");
	    
		cl1.Exibir();
		
		cliente cl2 = new cliente("Acerola", "1132432432","Itaqua", "45988057021");
		
		cl2.Exibir();
		
		cl2.setTelefoneCliente("12345");
		
		cl2.Exibir();
	
	}
}
