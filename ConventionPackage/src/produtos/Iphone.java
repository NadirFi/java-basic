package produtos;

import aplicativos.aparelho.telefonico.AparelhoTelefonico;
import aplicativos.navegador.internet.NavegadorInternet;
import aplicativos.reprodutor.musical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	public void tocar() {
		System.out.println("IPHONE: MUSICA TOCANDO!!");
	}

	public void pausar() {
		System.out.println("IPHONE: MUSICA PAUSADA !!");
	}

	public void selecionarMusica() {
		System.out.println("IPHONE: MUSICA SELECIONADA !!");
	}

	public void exibirPagina() {
		System.out.println("IPHONE: PAGINA EXIBIDA !!");
	}

	public void adicionarNovaAba() {
		System.out.println("IPHONE: NOVA ABA ADICIONADA !!");
	}

	public void atualizarPagina() {
		System.out.println("IPHONE: PAGINA AYUALIZADA !!");
	}

	public void ligar() {
		System.out.println("IPHONE: LIGANDO !!");
	}

	public void atender() {
		System.out.println("IPHONE: ATENDIDO !!");
	}

	public void iniciarCorreioVoz() {
		System.out.println("IPHONE: CORREIO DE VOZ INICIADO !!");
	}
	
}
