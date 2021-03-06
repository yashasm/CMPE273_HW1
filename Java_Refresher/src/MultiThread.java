
public class MultiThread implements Runnable{
	
	private String threadName;
	private int principle,rate,time;
	
	public MultiThread(String name, int p,int r,int t) {
		// TODO Auto-generated constructor stub
		this.threadName = name;
		this.principle = p;
		this.rate=r;
		this.time=t;
	}
	
	public void findInterest(int p,int r,int t){
		
		System.out.println("Thread - "+threadName+" calculating Simple Interest.");
		System.out.println("Simple Interest = "+"$"+(p*r*t)/100);
		System.out.println("Thread - "+threadName+" suspended.");
	}

	@Override
	public void run() {

		System.out.println("Welcome to thread - "+threadName);
		System.out.println("Loading.....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		findInterest(principle,rate,time);		
	}

	public static void main(String args[]){
		
		Thread t1 = new Thread(new MultiThread("Sherlock", 80,10,2));
		t1.start();
		Thread t2 = new Thread(new MultiThread("Rose", 100,15,1));
		t2.start();
	}

}
