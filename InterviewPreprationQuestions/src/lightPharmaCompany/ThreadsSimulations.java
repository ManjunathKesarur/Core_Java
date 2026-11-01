package lightPharmaCompany;

class ThreadsSimulatio extends Thread{
public void run() {
	for(int i=0;i<10;i++) {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(i);
	}
}}


class the implements Runnable{

	@Override
	public void run() {
		
		int n=1;
		
		while (n<10) {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}System.out.println(n);
	n++;}
	}
	
}

class ThreadsSimulations {
	public static void main(String[] args) {
		ThreadsSimulatio simulatio=new ThreadsSimulatio();
		simulatio.run();
		
		the s=new the();
		Thread thread=new Thread(s);
		thread.start();
		System.out.println("Main thread continues immediately!");
		
	}
}
