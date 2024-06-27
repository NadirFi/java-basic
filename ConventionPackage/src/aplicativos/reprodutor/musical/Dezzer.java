package aplicativos.reprodutor.musical;

public class Dezzer implements ReprodutorMusical {

	public void tocar() {
		System.out.println("DEZZER: MUSICA TOCANDO !!");
	}

	public void pausar() {
		System.out.println("DEZZER: MUSICA PAUSADA !!");
	}

	public void selecionarMusica() {
		System.out.println("DEZZER: MUSICA SELECIONADA !!");
	}
}
