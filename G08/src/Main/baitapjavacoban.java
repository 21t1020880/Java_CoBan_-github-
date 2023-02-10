package Main;

import java.util.Scanner;

public class baitapjavacoban {
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double x1, x2, delta;
		delta = Math.pow(b,2) - 4*a*c;
		if(a == 0) {
			System.out.print("Nhap du lieu sai");
		}else {
			if(delta < 0) {
				System.out.print("PT vo nghiem!");
			}else if(delta == 0) {
				x1 = -b/2*a;
				System.out.print("PT co nghiem kep x1=x2: " + x1);
			}else {
				x1 = (-b + Math.sqrt(delta)) / (2*a);
				x2 = (-b - Math.sqrt(delta)) / (2*a);
				System.out.println("PT co 2 nghiem phan biet x1, x2: " + " x1=" + x1 + " x2=1" + x2);
			}
		}
	}*/
	/*public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Gthua = 1;
		if(n >= 0) {
			for(int i = 1; i <= n; i++) {
					Gthua = Gthua * i;
			}
		}
		System.out.print(Gthua);
	}*/
	/*public static int fibonacci(int n) {
		if(n == 1 || n == 2)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(fibonacci(n));
	}*/
	/*public static boolean Songuyento(int n) {
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
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen to n: ");
		int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (Songuyento(i) == true){
                System.out.print(" " + i);
            }
        }
	}*/
	/*public static boolean Songuyento(int n) {
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
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
	    for(int i = 2; c < n; i++){
	        if (Songuyento(i) == true){
	            System.out.print(" " + i);
	            c++;
	       	}
	    }
	}*/   
	/*public static boolean Songuyento(int n) {
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
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Liet ke tat ca cac so co 5 chu so: ");
		int dem = 0;
	    for(int i = 10001; i < 99999; i+=2){
	        if (Songuyento(i) == true){
	        	System.out.println(" " + i);
	            dem++;
	       	}
	    }
	    System.out.print("Tong cac so nguyen to co 5 chu so la: " + dem);
	}*/
	
	/*public static int Songuyen(int n) {
		int tong = 0;
		for(int i = 1; i <= n; i++) {
			tong = tong + i;
		}
		return tong;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
	    System.out.print("Tong cac chu so nguyen n: " + Songuyen(n));
	}*/
	
	/*public static boolean Thuannghich(int n) {
		int m = n;
		int temp = 0;
		while(n > 0) {
			temp = temp*10 + n%10;
			n = n/10;
		}
		if(temp == m) return true;
		return false;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cac so thuan nghich co 6 chu so: ");
		int dem = 0;
	    for(int i = 100000; i <= 999999; i++){
	        if (Thuannghich(i) == true){
	        	if(dem % 10 == 0) System.out.println(" ");
		            dem++;
		            System.out.print(" " + i);
	       	}
	    }
	}*/
	
	public static int fibonacci(int n) {
		if (n < 0) {
            return -1;
		}else if(n == 1 || n == 2) {
			return n;
		}else 
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
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
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen n: ");
		int n = sc.nextInt();
		int i = 0;
        while(fibonacci(i) < n) {
        	int fi = fibonacci(i);
        	if (Songuyento(fi)) {
                System.out.print(fi + " ");
            }
            i++;
        }
	}
}