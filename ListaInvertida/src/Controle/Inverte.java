package Controle;

import modelInt.IListaInt;

public class Inverte {
	public void adicionar(IListaInt lista) throws Exception {
		lista.addFirst(3);
		lista.addLast(5);
		lista.addLast(18);
		lista.addLast(12);
		lista.addLast(9);
		lista.addLast(7);
		lista.addLast(6);
		lista.addLast(2);
		lista.addLast(13);
		lista.addLast(4);
		lista.addLast(16);
	}
	public void Contrario(IListaInt lista) throws Exception {
		adicionar(lista);
		int tam = lista.size();
		for(int J=0;J<tam;J++) {
			lista.addFirst(lista.get(J));
			lista.remove(J+1);
		}
	}
}
