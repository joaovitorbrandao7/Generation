package Familia28;

public class Animal1 extends Animal{

	private String Raca;
	
	
	public Animal1(String Nome, int Idade, String Especie, String Nincho, String Dono, String Cor, String Porte, String Raca) {
		super(Nome,Idade,Especie,Nincho,Dono,Cor,Porte);
		
		this.Raca = Raca;
		
	}


	public String getRaca() {
		return Raca;
	}


	public void setRaca(String Raca) {
		this.Raca = Raca;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome: " +getNome() + " \nIdade: " + getIdade() + " \nEspecie: " + getEspecie() + " \nNincho: " + getNincho() + " \nDono: " + getDono() + " \nCor: " + getCor() + " \nPorte: " + getPorte() + " \nRaça" + getRaca());
	}


	@Override
	public void emitirSom() {

		System.out.println(getNome() + " diz: Au au");
	}


	@Override
	public void Correr() {

       System.out.println(getNome() + " está correndo");		
	}


	@Override
	public void subirArvore() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
