import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a,b ;
		int i,k;
		byte d[]=new byte [0];
		long x,h;
		boolean EXSIT=false;
		while(!EXSIT) {
			a = scan.nextDouble();
			b = a;
			k = 0;
			System.out.println("What the type:");
			if ((long)a<a) {
				System.out.println("1 double");
				System.out.println("2 float");
			}
			else {
				System.out.println("1 long");
				System.out.println("2 int");
				System.out.println("3 short");
				System.out.println("4 byte");
			}
			System.out.println();
			
			x = (long)a;
			
			if (x==a) {
				switch(scan.nextInt()) {
				case 1:
					System.out.print(x+"=");
					System.out.print("(long)");
					d = new byte [64];
					if (x<0) {
						x=x+8388608*1048576*1048576*1048576*1048576;// 2^23*2^10^4
						d[0]=1;
					}
					else d[0]=0;
					for ( i=63;i>0;i--) {
						d[i]=(byte) (x%2);
						x=x/2;
					}
					break;
				case 2:
					System.out.print(x+"=");
					System.out.print("(int)");
					d = new byte [32];
					if (x<0) {
						x=x+2147483647+1;
						d[0]=1;
					}
					else d[0]=0;
					for (i=31;i>0;i--) {
						d[i]=(byte) (x%2);
						x=x/2;
					}
					break;
				case 3:
					System.out.print(x+"=");
					System.out.print("(short)");
					d = new byte [16];
					if (x<0) {
						x=x+32768;
						d[0]=1;
					}
					else d[0]=0;
					for (i=15;i>0;i--) {
						d[i]=(byte) (x%2);
						x=x/2;
					}
					break;
				case 4:
					System.out.print(x+"=");
					System.out.print("(byte)");
					d = new byte [8];
					if (x<0) {
						x=x+128;
						d[0]=1;
					}
					else d[0]=0;
					for (i=7;i>0;i--) {
						d[i]=(byte) (x%2);
						x=x/2;
					}
					break;
				}
			} else {
				switch(scan.nextInt()) {
				case 1:
					d = new byte [64];
					System.out.print(a+"=");
					System.out.print("(double)");
					while((long)a<a)
						a=a*10;
					if (a<0) {
						a=a+4503599627370496L;
						d[0]=1;
					}
					else d[0]=0;
					for (i=63;i>11;i--) {
						d[i]=(byte) (a%2);
						a=a/2;
					}
					while(x>0){
						x=x/10;
						k++;
					}
					for (i=11;i>0;i--) {
						d[i]=(byte) (k%2);
						k=k/2;
					}
					break;
				case 2:
					d = new byte [32];
					System.out.print(a+"=");
					System.out.print("(float)");
					while((long)a<a)
						a=a*10;
					if (a<0) {
						a=a+8388608;
						d[0]=1;
					}
					else d[0]=0;
					for (i=31;i>8;i--) {
						d[i]=(byte) (a%2);
						a=a/2;
					}
					while(x>0){
						x=x/10;
						k++;
					}
					for (i=8;i>0;i--) {
						d[i]=(byte) (k%2);
						k=k/2;
					}
					break;
				}
			}
			for (i=0;i<d.length;i++) {
				System.out.print(d[i]);
				if ((i+1)%8 == 0)
					System.out.print(" ");	
		
			}
			System.out.print(", 0x");
			if (b<0) {
				System.out.print("-");
				b=-b;
			}
			x=(long)b;
			b=b-x;
			k=0;
			h=x;
			while (h>0) {
				k++;
				h=(long)h/16;
			}
			d= new byte[k];
			for (i=d.length-1;i>-1;i--) {
				d[i]=(byte)( x % 16);
				x=x/16;
			}
			for (i=0;i<d.length;i++) System.out.print(d[i]<10?d[i]:
				  	d[i]==10?"A":d[i]==11?"B":d[i]==12?"C":d[i]==13?"D":d[i]==14?"E":d[i]==15?"F":"");
			while ((int)b<b) b=b*10;
			x=(long)b;
			if (x>0) System.out.print(",");

			k=0;
			h=x;
			while (h>0) {
				k++;
				h=(long)h/16;
			}
			d= new byte[k];
			for (i=d.length-1;i>-1;i--) {
				d[i]=(byte)( x % 16);
				x=x/16;
			}
			for (i=0;i<d.length;i++) System.out.print(d[i]<10?d[i]:
				  	d[i]==10?"A":d[i]==11?"B":d[i]==12?"C":d[i]==13?"D":d[i]==14?"E":d[i]==15?"F":"");
			System.out.println();
			System.out.println("Do you want exsit?");
			System.out.println("true/false");
			EXSIT=scan.nextBoolean();
		}

	}

}
