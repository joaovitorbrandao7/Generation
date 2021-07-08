package Familia28;

public class cliente {
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
	
	private String nomeCliente;
	private String rgCliente;
	private String endCliente;
	private String telefoneCliente;

	public cliente(String nomeCliente, String rgCliente, String endCliente, String telefoneCliente) {
		this.nomeCliente = nomeCliente;
		this.rgCliente = rgCliente;
		this.endCliente = endCliente;
		this.telefoneCliente = telefoneCliente;
		
		
	}
	public void Exibir() {
		System.out.println("\nCadastro\n\nNome: " + nomeCliente+" \nRg: "+rgCliente+
				"\nEndereço: "+endCliente+"\nTelefone: "+telefoneCliente);
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getRgCliente() {
		return rgCliente;
	}
	public void setRgCliente(String rgCliente) {
		this.rgCliente = rgCliente;
	}
	public String getEndCliente() {
		return endCliente;
	}
	public void setEndCliente(String endCliente) {
		this.endCliente = endCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
    
}
