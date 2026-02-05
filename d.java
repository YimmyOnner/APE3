import java.util.Scanner;

public class d {

    public static void main(String[] args) {

        int[][] matriz = new int[2][3];
        int[][] matriz2 = new int[2][3];

        System.out.println("  ");
        System.out.println("-----------------------------------------------------");
        System.out.println("Bienvenido(a) al sistema de operaciones con matrices");
        System.out.println("-----------------------------------------------------");
        System.out.println("  ");

        llenarMatriz(matriz, matriz2);

    }

    public static void llenarMatriz(int[][] matriz, int[][] matriz2) {
        Scanner teclado = new Scanner(System.in);
        int i, j;
        int [][]resultado1= new int[2][3]; 
        int [][]resultado2= new int[2][3];
        int [][]resultado3= new int[2][3];

        System.out.println("================= MATRIZ 1 =================");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) 
            {
                System.out.print("Ingrese el numero de la posicion" + " [ " +i +" ]"+ " "+ "[ "+ j +" ]" + "\t");
                System.out.println();
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("  ");
        System.out.println("================= MATRIZ 2 =================");

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) 
            {
                System.out.println("Ingrese el numero de la posicion" + " [ " +i +" ]"+ " "+ "[ "+ j +" ]" + "\t");
                matriz2[i][j] = teclado.nextInt();
            }
        }
        
        resultado1= SumaMatriz(matriz, matriz2);
        resultado2= RestaMatriz(matriz, matriz2);
        resultado3 =mulMatriz(matriz, matriz2);


        System.out.println("  ");
        System.out.println("============ RESULTADOS ============");
        System.out.println("  ");
        System.out.println("El resultado de la suma es: "); System.out.println("  "); presentarMatriz(resultado1);
        System.out.println("El resultado de la resta es: "); System.out.println("  "); presentarMatriz(resultado2);
        System.out.println("El resultado de la multiplicacion es: "); System.out.println("  "); presentarMatriz(resultado3);

    }

    public static void presentarMatriz(int[][] total) {
         
        int i, j;
        for (i = 0; i < 2; i++) {
            System.out.print("| ");
            for (j = 0; j < 3; j++) 
            {
                System.out.print(total [i][j] + "  ");
            }
            System.out.println("|");    
        }
    }

    public static int [][] SumaMatriz(int[][] matriz, int[][] matriz2) {
        int [][] sumaMatriz = new int[2][3];
        int i, j;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) 
            {
             sumaMatriz[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }
        return sumaMatriz;
    }

    public static int [][] RestaMatriz(int[][] matriz, int[][] matriz2) {
        int [][] restarMatriz = new int[2][3];
        int i, j;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
             restarMatriz[i][j] = matriz[i][j] - matriz2[i][j];
             
            }
        }
        return restarMatriz;
    }

    public static int [][] mulMatriz(int[][] matriz, int[][] matriz2) {
        int [][] multiMatriz = new int[2][3];
        int i, j;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) 
            {
             multiMatriz[i][j] = matriz[i][j] * matriz2[i][j]; 
            }
        }
        return multiMatriz;
    }
    
}
