import java.io.*;
class GFG extends Thread {
	public void run()
	{
		System.out.print("Welcome to world.");
	}
	public static void main(String[] args)
	{
		GFG g = new GFG(); // creating thread
		g.start(); // starting thread
	}
}

