package Familia28;

public class Aviao {
	//atributos
	private String nome;
	private String modelo;
	private String origem;
	private String destino;
	private String responsavel;
	private String horario;
	
	//construtor
	public Aviao(String nome, String modelo, String origem, String destino, String responsavel, String horario){
		this.nome = nome;
		this.modelo = modelo;
		this.origem = origem;
		this.destino = destino;
		this.responsavel = responsavel;
	    this.horario = horario;
		
	}
	
	public Aviao(String origem, String destino, String horario){
		this.origem = origem;
		this.destino = destino;
	    this.horario = horario;
		
	}
	public void InformacoesPartida() {
		System.out.println("\nO Avião com Origem: " + origem + "\n e com Destino para " + destino + "\n vai decolar as: "+horario +"h");
	}
	
	public void relatorioGeral() {
		System.out.println("\nRelatorio\nNome: "+nome+ "\nModelo: " + modelo + "\nOrigem: " + origem + "\nDestino: " + destino + "\nResposavel/Pilot: "+responsavel + "\nHorario: "+ horario);
		
	}
	
	public void decolar() {
		if(horario!=" ") {
		System.out.println("\n" + nome + " Decolando");
	}else {
		System.out.println("Digite um horario para decolar!");
	}
	}
	public void pousar() {
		System.out.println("\n" + nome + " Decolando");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	

}
