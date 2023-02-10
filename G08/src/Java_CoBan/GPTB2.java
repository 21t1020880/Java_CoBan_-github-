package Java_CoBan;

import java.util.Scanner;

public class GPTB2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		double a = sc.nextDouble();
		System.out.print("Nhap b: ");
		double b = sc.nextDouble();
		System.out.print("Nhap c: ");
		double c = sc.nextDouble();
		double x1, x2, Delta;
		Delta = Math.pow(b, 2) - 4*a*c;
		if (a == 0) System.out.print("Nhap sai!");
		else {
			if (Delta < 0) System.out.print("Phuong trinh vo nghiem!");
			if (Delta == 0) {
				x1 = -b/2*a;
				System.out.print("Phuong trinh co nghiem kep:   x1 = x2 = " + x1);
			}
			if (Delta > 0) {
				x1 = (-b + Math.sqrt(Delta)) / (2*a);
				x2 = (-b - Math.sqrt(Delta)) / (2*a);
				System.out.print("Phuong trinh co hai nghiem phan biet: x1 " + x1);
				System.out.print("Phuong trinh co hai nghiem phan biet: x2 " + x2);
			}
		}
	}

}
