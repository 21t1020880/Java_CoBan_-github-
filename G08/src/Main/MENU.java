package Main;
import java.util.Scanner;
public class MENU {

	public static void main(String[] args) {
		while (true) {
			System.out.print("***\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~\t\t***\n");
			System.out.print("***	[1]. Giai phuong trinh bac hai.                         ***\n");
			System.out.print("***	[2]. Tinh giai thua cua n.                              ***\n");
			System.out.print("***	[3]. Tim so Fibonacci thu n.                            ***\n");
			System.out.print("***	[4]. Tim USCLN va BSCNN cua hai so a va b.              ***\n");
			System.out.print("***	[5]. Liet ke so nguyen ro nho hon n.                    ***\n");
			System.out.print("***	[6]. Liet ke n so nguyen to dau tien.                   ***\n");
			System.out.print("***	[7]. Liet ke tat ca so nguen to co 5 chu so.            ***\n");
			System.out.print("***	[8]. Tong cac chu so cua so nguyen n.                   ***\n");
			System.out.print("***	[9]. Liet ke tat ca cac so thuan nghich co 6 chu so.    ***\n");
			System.out.print("***	[10]. Liet ke cac so Fibonacci nho hon n.               ***\n");
			Scanner sc = new Scanner(System.in);
			System.out.print("\nChon chuong trinh: ");
			int key = sc.nextInt();
			switch(key) {
			case 1:
				System.out.print("\n[1]. Giai phuong trinh bac hai.\n\n");
				GPTB2();
				System.out.print("\n\n");
				break;
			case 2:
				System.out.print("\n[2]. Tinh giai thua cua n.\n\n");
				GiaiThua();
				System.out.print("\n\n");
				break;
			case 3:
				System.out.print("\n[3]. Tim so Fibonacci thu n.\n\n");
				System.out.print("Nhap so nguyen n: ");
				int n = sc.nextInt();
				System.out.print("\nSo Fibonacci thu n la: " + fibonacci(n) + "\n\n");
				break;
			case 4:
				System.out.print("\n[4]. Tim so USCLN va BSCNN cua hai so a va b.\n\n");
				break;
			case 5:
				System.out.print("\n[5]. Liet ke so nguyen to nho hon n.\n\n");
				System.out.print("Nhap so nguyen n: ");
				int a = sc.nextInt();
		        for (int i = 2; i < a; i++) {
		            if (Songuyento(i) == true) 
		            	System.out.print(" " + i);
		        }
		        System.out.print("\n\n");
				break;
				
			//Cau 6:
			case 6:
				System.out.print("\n[6]. Liet ke n so nguyen to dau tien.\n\n");
				System.out.print("Nhap so nguyen n: ");
				int b = sc.nextInt();
				int c = 0;
				System.out.print(b + " so nguyen to dau tien la: ");
			    for(int i = 2; c < b; i++){
			        if (Songuyento(i) == true){
			            System.out.print(" " + i);
			            c++;
			       	}
			    }
			    System.out.print("\n\n");
			    break;
			//Cau 7:
			case 7:
				System.out.print("\n[7]. Liet ke tat ca so nguyen to co 5 chu so.\n\n");
				System.out.print("Cac so ngyen to co 5 chu so la: ");
				int dem = 0;
			    for(int i = 10001; i < 99999; i+=2){
			        if (Songuyento(i) == true){
			        	System.out.println(" " + i);
			            dem++;
			       	}
			    }
			    System.out.print("So cac so nguyen to co 5 chu so la: " + dem);
			    System.out.print("\n\n");
			    break;
			case 8:
				System.out.print("\n[8]. Tong cac chu so cua so nguyen n. \n\n");
				System.out.print("Nhap so nguyen n can tinh tong cac chu so: ");
				int d = sc.nextInt();
				System.out.print("Tong cac chu so nguyen n: " + Songuyen(d));
				System.out.print("\n\n");
			    break;
			case 9:
				System.out.print("\n[9]. Liet ke tat ca so thuan nghich co 5 chu so. \n\n");
				System.out.print("Cac so thuan nghich co 6 chu so: ");
				int cnt = 0;
			    for(int i = 100000; i <= 999999; i++){
			        if (Thuannghich(i) == true){
			        	if(cnt % 10 == 0) System.out.println(" ");
				            cnt++;
				            System.out.print(" " + i);
			       	}
			    }
			    System.out.print("\n\n");
			    break;
			case 10:
				System.out.print("\n[10]. Liet ke cac so Fibonacci nho hon n.\n\n");
				System.out.print("Nhap so nguyen n: ");
				int e = sc.nextInt();
		        for (int i = 2; i < e; i++) {
		            if (Songuyento(i) == true) {
		            	if (i < e)
		            		System.out.print(" " + i);
		            }
		        }
		        System.out.print("\n\n");
			    break;
			}
		}

	}
	
	//Cau 9:
	private static boolean Thuannghich(int i) {
		int m = i;
		int temp = 0;
		while(i > 0) {
			temp = temp*10 + i%10;
			i = i/10;
		}
		if(temp == m) return true;
		return false;
	}
	//Cau 8:
	private static int Songuyen(int n) {
		int tong = 0;
        do {
            tong = tong + n % 10;
            n = n / 10;
        } while (n > 0);
        return tong;
	}
	//Cau 5:
	public static boolean Songuyento(int n) {
		if(n < 2) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++){
	        if(n % i == 0){
	            return false;
	        }
	    }
		return true;
	}
	
	//Cau 3:
	private static int fibonacci(int n) {
		if(n == 1 || n == 2)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	//Cau 2:
	private static void GiaiThua() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen n: ");
		int n = sc.nextInt();
		int Gthua = 1;
		if(n >= 0) {
			for(int i = 1; i <= n; i++) {
					Gthua = Gthua * i;
			}
		}
		System.out.print("\nGiai thua cua n la: " + Gthua);
		System.out.print("\n\n");
	}
	
	
	//Cau 1:
	private static void GPTB2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		double a = sc.nextDouble();
		System.out.print("Nhap b: ");
		double b = sc.nextDouble();
		System.out.print("Nhap c: ");
		double c = sc.nextDouble();
		double x1, x2, Delta;
		Delta = Math.pow(b, 2) - 4*a*c;
		if (a == 0) System.out.print("\nNhap sai!\n\n");
		else {
			if (Delta < 0) System.out.print("\nPhuong trinh vo nghiem!\n\n");
			if (Delta == 0) {
				x1 = -b/2*a;
				System.out.print("\nPhuong trinh co nghiem kep:   x1 = x2 = " + x1);
				System.out.print("\n\n");
			}
			if (Delta > 0) {
				x1 = (-b + Math.sqrt(Delta)) / (2*a);
				x2 = (-b - Math.sqrt(Delta)) / (2*a);
				System.out.println("PT co 2 nghiem phan biet x1, x2: " + " x1= " + x1 + "\t\t x2= " + x2);
				System.out.print("\n\n");
			}
		}
	}

}
