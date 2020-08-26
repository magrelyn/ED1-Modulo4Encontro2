package controle;

import modelo.Fila_Caminhoneiros;

public class TestaFila {

	public static void main(String[] args) {

		Fila_Caminhoneiros fila = new Fila_Caminhoneiros();

		fila.inicializa();
		
		System.out.println("#### enfileirar ####\n");

		fila.enfileirar("Luiz Augusto");
		fila.enfileirar("Bino");
		fila.enfileirar("Pedro");
		fila.enfileirar("Jorge");
		fila.enfileirar("João");
		fila.enfileirar("Jorge");
		fila.enfileirar("Grilo");
		fila.enfileirar("Jão");
		fila.enfileirar("Marcio");
		fila.enfileirar("João Vitor");
		fila.enfileirar("Marcos");

		System.out.println("\n#### mostrarFila ####\n");
		
		fila.mostrarFila();
		
		System.out.println("\n#### desinfileirar ####\n");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(fila.desenfileirar());
		}

		System.out.println(fila.desenfileirar());
		

	}

}
