package Familia28;

public class AnimalTeste {

	public static void main(String[] args) {

		Animal1 Cachorro = new Animal1 ("Acerola",2,"Canideo","Terrestre","João","Branco e Preto","Pequeno","Salsicha");
		Cachorro.imprimirInfo();
		
		Animal2 Cavalo = new Animal2 ("Pé de Pano",10,"Ponei","Terrestre","Jhonson","Marrom","Pequeno","Simples");
        Cavalo.imprimirInfo();
        
        Animal3 Preguica = new Animal3 ("Sid",3,"Xenarthra","Terrestre","Cinza","Medio","Grande");
        Preguica.imprimirInfo();
        
        
        System.out.println(" -----------------------------------------------------------------");
        Cachorro.emitirSom();
        Cachorro.Correr();

        System.out.println(" -----------------------------------------------------------------");

        Cavalo.emitirSom();
        Cavalo.Correr();
        
        System.out.println(" -----------------------------------------------------------------");

        Preguica.emitirSom();
        Preguica.subirArvore();
	}

}
