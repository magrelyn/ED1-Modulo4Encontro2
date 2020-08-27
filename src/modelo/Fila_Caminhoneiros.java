package modelo;

public class Fila_Caminhoneiros {

	private String caminhoneiros[] = new String[10];
	private int total;

	public void inicializa() {
		this.total = 0;
	}

	public boolean estaVazia() {
		if (this.total == 0)
			return true;
		else
			return false;
	}

	public boolean estaCheia() {
		if (this.total >= 10)
			return true;
		else
			return false;
	}

	public void enfileirar(String caminhoneiro) {
		if (this.estaCheia() == false) {
			this.total++;
			this.caminhoneiros[this.total - 1] = caminhoneiro;
		} else {
			System.out.println("[!] Fila cheia [!]");
		}
	}

	public String desenfileirar() {
		if (this.estaVazia())
			return "[!] Fila vazia [!]";
		else {
			String resp = this.caminhoneiros[0];
			this.total--;
			this.reposiciona();
			return resp;
		}
	}
	
	private void reposiciona() {
		for (int i = 0; i < this.total; i++) {
			this.caminhoneiros[i] = this.caminhoneiros[i+1];
		}
	}
	
	public void mostrarFila() {
		for (int i = 0; i < this.total; i++) {
			System.out.println(this.caminhoneiros[i]);
		}
	}
	
	public void copyTo(Fila_Caminhoneiros fila) {
		fila.caminhoneiros = this.caminhoneiros;
		fila.total = this.total;
	}

}
