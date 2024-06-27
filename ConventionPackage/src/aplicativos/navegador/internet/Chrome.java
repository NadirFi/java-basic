package aplicativos.navegador.internet;

public class Chrome implements NavegadorInternet {
	
	public void exibirPagina() {
		System.out.println("CHROME:  PAGINA SENDO EXIBIDA !!");
	}

	public void adicionarNovaAba() {
		System.out.println("CHROME:  ADICIONANDO NOVA ABA !!");
	}

	public void atualizarPagina() {
		System.out.println("CHROME:  PAGINA ATUALIZADA !!");
	}
}
