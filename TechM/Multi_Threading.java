package TechM;
public class Multi_Threading extends Thread {
	int threadNumber;
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			Multi_Threading call=new Multi_Threading();
			call.threadNumber=i;
			call.start();
			
		}
	}
		//Multi_Threading call=new Multi_Threading();
	
		
		//call.run();
	
		
		//for(int a=0;a<5;a++) {
			//Multi_Threading call2=new Multi_Threading();
	//	}
	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println(i);
				for (int j = 1; j < 100; j++) {
			System.out.println(j);
		
	}
}
}
}