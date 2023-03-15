package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCarro;

public class Principal {

	public static void main(String[] args) {
		Semaphore mutex = new Semaphore(1);
		char[] direcoes = {'N', 'S', 'L', 'O'};
		
		for (int i = 0; i < 4; i++) {
			Thread carro = new ThreadCarro(mutex, direcoes[i], i + 1);
			carro.start();
		}
	}

}
