
public class ArrayDebugging {

	public static void main(String[] args) {
		  // Paso 1: Crear un array de 5 elementos
        int[] numbers = {1, 2, 3, 4, 5};

        // Mostrar el array original
        System.out.println("Array original:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Paso 2: Intentar modificar el array
        try {
            System.out.println("\nAccediendo al elemento en el índice 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError: " + e.toString());
        }

        try {
            int sum = 0;
            for (int i = 0; i <= numbers.length; i++) {  
                sum += numbers[i];
            }
            System.out.println("\nLa suma de los elementos es: " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError al intentar sumar: " + e.toString());
        }

        int[] reversedArray = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - i]; 
        }

        // Mostrar el array invertido
        System.out.println("\nArray invertido:");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();
	}

}
