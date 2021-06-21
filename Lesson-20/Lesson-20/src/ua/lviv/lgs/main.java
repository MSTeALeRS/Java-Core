package ua.lviv.lgs;

import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		MyThreads mT = new MyThreads();

		mT.start();

		RunnableThread rt = new RunnableThread();
		Thread t = new Thread(rt);

		t.start();

	}

}

class MyThreads extends Thread {

	@Override
	public void run() {
		System.out.println("Press number");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int[] fib = new int[n + 1];
		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];

			System.out.println(fib[i]);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class RunnableThread implements Runnable {

	@Override
	public void run() {
		System.err.println("Press number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] fib = new int[n + 1];
		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];

		}

		for (int i = fib.length - 1; i > 0; i--) {
			System.err.println(fib[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
