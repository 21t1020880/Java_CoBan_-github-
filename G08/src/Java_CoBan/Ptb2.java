package Java_CoBan;
import java.util.Scanner;
public class Ptb2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so a: ");
		double a = sc.nextDouble();
		System.out.print("Nhap so b: ");
		double b = sc.nextDouble();
		System.out.print("Nhap so c: ");
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
	}

}
