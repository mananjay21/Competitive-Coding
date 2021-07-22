import java.util.Scanner;

public class MyThread implements Runnable {
	Thread thrd;
	int i;
	static int sum;
	static int m[][];
	static int row;
        static int col;
	MyThread(String name,int c1){
		thrd=new Thread(this,name);
		thrd.start();
		i=c1;
	}
	public void run() {
		while(i<row) {
			int s=0,e=col-1;
                          while(s<e){
                               int temp=m[i][s];
                                m[i][s]=m[i][e];
                                m[i][e]=temp;
                                s++;
                                e--;
                          }
			i+=2;
		}
	}

	public static void main(String[] args) {
		System.out.println("MAIN THREAD STARTING");
		Scanner sc=new Scanner(System.in);
		String s[]=(sc.nextLine()).split(" ");
                row=Integer.parseInt(s[0]);
                col=Integer.parseInt(s[1]);
                m=new int[row][col];
                for(int j=0;j<row;j++){
                    String str[]=(sc.nextLine()).split(" ");
                    for(int k=0;k<col;k++)
                        m[j][k]=Integer.parseInt(str[k]);
                }
		sc.close();
		MyThread T1=new MyThread("T1",0);
		MyThread T2=new MyThread("T2",1);
		try {
			T1.thrd.join();
			T2.thrd.join();
			for(int x=0;x<row;x++){
                           for(int y=0;y<col;y++)
                                 System.out.print(m[x][y]+" ");
                           System.out.println();
                        }
		}
		catch(InterruptedException e) {
			//System.out.println("Main Thread Interuppted");
		}
		//System.out.println("Main Thread Ending");
			
	}

}