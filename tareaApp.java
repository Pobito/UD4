package Tarea04;

public class tareaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// He creado un procedimiento para cada uno de los ejercicios de la tarea04
		
		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5();
	}

	// Procedimiento para el ejercicio 1
	public static void ejercicio1 () {
		int n1 = 10, n2 = 5;
		
		System.out.println("La suma es " + (n1 + n2));
		System.out.println("La resta es " + (n1 - n2));
		System.out.println("La multiplicación es " + (n1 * n2));
		System.out.println("La división es " + (n1 / n2));
		System.out.println("El módulo es " + (n1 % n2));
	}
	
	// Procedimiento para el ejercicio 2
	public static void ejercicio2 () {
		int n = 10;
		double a = 22.5;
		char c = 'A';
		
		System.out.println("N = " + n + "\nA = " + a + "\nC = " + c);
		System.out.println("La suma de N + A = " + (n + a));
		System.out.println("La resta de A - N = " + (a - n));
		System.out.println("El valor numérico de C = " + (int) c); // Casteamos el valor del char C a un entero
	}
	
	// Procedimiento para el ejercicio 3
	public static void ejercicio3() {
		int x = 10, y = 15;
		double n = 5.25, m = 22.8;
		
		System.out.println("X = " + x + "\nY = " + y + "\nN = " + n + "\nM = " + m);
		System.out.println("Suma X + Y = " + (x + y));
		System.out.println("Resta X - Y = " + (x - y));
		System.out.println("Producto X * Y = " + (x * y));
		System.out.println("Cociente X / Y = " + (x / y));
		System.out.println("Resto X % Y = " + (x % y));
		System.out.println("Suma N + M = " + (n + m));
		System.out.println("Resta N - M = " + (n - m));
		System.out.println("Producto N * M = " + (n * m));
		System.out.println("Cociente N / M = " + (n / m));
		System.out.println("Resto N % M = " + (n % m));
		System.out.println("El doble de X " + (x * 2));
		System.out.println("El doble de Y " + (y * 2));
		System.out.println("El doble de N " + (n * 2));
		System.out.println("El doble de M " + (m * 2));
		System.out.println("La suma de todas las variables = " + (x + y + n + m));
		System.out.println("El producto de todas las variables = " + (x * y * n * m));
	}
	
	// Procedimiento para el ejercicio 4
	public static void ejercicio4() {
		int n = 8;
		
		n += 77; // Es lo mismo que poner n = n + 77
		System.out.println(n);
		n -= 3; // Lo mismo pero con resta
		System.out.println(n);
		n *= 2; // Lo mismo pero con producto
		System.out.println(n);
	}
	
	public static void ejercicio5() {
		int a = 50, b = 30, c = 10, d = 5;
		
		b = c;
		c = a;
		a = d;
		d = b;
		
		System.out.println("A = " + a + "\nB = " + b + "\nC = " + c + "\nD = " + d);
	}
}
