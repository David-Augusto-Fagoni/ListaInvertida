package view;

import Controle.Inverte;
import modelInt.IListaInt;
import modelInt.ListaInt;

public class Principal {

	public static void main(String[] args) {
		IListaInt Lista = new ListaInt();
		Inverte I = new Inverte();
		try {
			I.Contrario(Lista);
			int tam = Lista.size();
			for(int J=0;J<tam;J++) {
				System.out.println(Lista.get(J));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
