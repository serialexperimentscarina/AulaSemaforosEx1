package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCarro;

public class Principal {

	public static void main(String[] args) {
		Semaphore mutex = new Semaphore(1);
		char[] direcoes = {'N', 'S', 'L', 'O'};
		
		for (char direcao : direcoes) {
			Thread carro = new ThreadCarro(direcao, mutex);
			carro.start();
		}
	}

}
