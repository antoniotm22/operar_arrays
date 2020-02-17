package operar_arrays;

public class arrays {

	
public static void recorrerAray() {
	int array[]= new int [10];
	for (int i = 0; i < array.length; i++) {
		array[i] = i + 1;
		
	}	
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+"/n");
	}
	System.out.println();
}

public static void imprimeArray() {
	int array[]= new int[10];
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+"/n");
	}
	System.out.println();
}

public static void rellenar_array() {
	
	int array[]= new int [10];
	for(int i =0; i<array.length; i++) {
		array[i] = (int)Math.round(Math.random()*(20-1)+1);	
		System.out.println(array);
	}
}

public static void sumarArray() {
	int array[]= new int[10];
	int total=0;
	int i;
	
	for ( i = 0; i < array.length; i++) {
		array[i] = i + 1;		
	}
	total += array[i];
	System.out.println(total);
}

public static void frase() {
	System.out.println("Hola mentecato");
}

	
	
	public static void main(String[] args) {
	recorrerAray();
	
	}
	
	

}