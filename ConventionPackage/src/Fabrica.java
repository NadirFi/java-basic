import aplicativos.navegador.internet.Chrome;
import aplicativos.reprodutor.musical.Spotify;
import produtos.Iphone;

public class Fabrica {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		Chrome exemploNavegador = new Chrome();
		Spotify exemploReprodutorMusica = new Spotify();
		
		System.out.println("-----------------------------------------------------------");
		
		//Reprodutod de Musicas
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		//Aparelho Telefonico
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		//NavegadorInternet
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		System.out.println("-----------------------------------------------------------");
		
		//Exemplo
		exemploNavegador.exibirPagina();
		exemploNavegador.adicionarNovaAba();
		exemploNavegador.atualizarPagina();
		
		System.out.println("-----------------------------------------------------------");
		
		//Exemplo
		exemploReprodutorMusica.tocar();
		exemploReprodutorMusica.pausar();
		exemploReprodutorMusica.selecionarMusica();
		
	}
}
