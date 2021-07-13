package Familia28;

public abstract class Animal {
	private String Nome;
	private int Idade;
	private String Nincho;
	private String Dono;
	private String Cor;
	private String Porte;
	private String Especie;
	
	abstract public void emitirSom();
	
	public Animal(String Nome, int Idade, String Especie, String Nincho, String Dono, String Cor, String Porte) {
		super();
		this.Nome = Nome;
		this.Idade = Idade;
		this.Nincho = Nincho;
		this.Dono = Dono;
		this.Porte = Porte;
		this.Cor = Cor;
		this.Especie = Especie;
		
	}
	
	public Animal(String Nome, int Idade, String Especie, String Nincho, String Cor, String Porte) {
		super();
		this.Nome = Nome;
		this.Idade = Idade;
		this.Nincho = Nincho;
		this.Porte = Porte;
		this.Cor = Cor;
		this.Especie = Especie;
		
			
}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int Idade) {
		this.Idade = Idade;
	}

	public String getNincho() {
		return Nincho;
	}

	public void setNincho(String Nincho) {
		this.Nincho = Nincho;
	}

	public String getDono() {
		return Dono;
	}

	public void setDono(String Dono) {
		this.Dono = Dono;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String Cor) {
		this.Cor = Cor;
	}

	public String getPorte() {
		return Porte;
	}

	public void setPorte(String Porte) {
		this.Porte = Porte;
	}

	public String getEspecie() {
		return Especie;
	}

	public void setEspecie(String especie) {
		Especie = especie;
	}
		
		
}