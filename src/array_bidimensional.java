
import java.util.Scanner;

public class array_bidimensional {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            System.out.println();
            System.out.println("=========================");
            System.out.println("= Elige una opción      =");
            System.out.println("= 1- arrayCreacion      =");
            System.out.println("= 2- arraySimetrico     =");
            System.out.println("= 3- arraySuma          =");
            System.out.println("= 4- arrayDiagonal      =");
            System.out.println("= 5- arrayMarco         =");
            System.out.println("= 6- arrayMarcoCreado   =");
            System.out.println("= 7- salir              =");
            System.out.println("=========================");
            int op = Integer.parseInt((read.next()));
            switch (op) {
                case 1:
                    arrayCreacion();
                    break;
                case 2:
                    arraySimetrico();
                    break;
                case 3:
                    arraySuma();
                    break;
                case 4:
                    arrayDiagonal();
                    break;
                case 5:
                    arrayMarco();
                    break;
                case 6:
                    arrayMarcoCreado();
                    break;
                case 7:
                    seguir = false;

            }
        }
    }

    public static void arrayCreacion() {
        int[][] arrayBi = new int[5][5];
        System.out.println("se agrega los numeros");

        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                arrayBi[i][j] = i + j;
            }
        }

        System.out.println();
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.print(arrayBi[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] fila : arrayBi) {
            for (int i : fila) {
                System.out.print(i + "  ");
            }
            System.out.println();

        }
    }

    public static void arraySimetrico() {
        Scanner read = new Scanner(System.in);
        int[][] arrayBi = new int[4][4];
        boolean esSimetrico = false;

// se rellena el array
        System.out.println("Escribe números enteros:");
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                arrayBi[i][j] = read.nextInt();
            }
        }
        System.out.println("--");
// comprobacion
        int i = 0;
        while (i < arrayBi.length && esSimetrico == false) {
            int j = 0;
            while (j < arrayBi.length && esSimetrico == false) {
                if (arrayBi[i][j] == arrayBi[j][i]) {
                    esSimetrico = true;
                }
                j++;
            }
            i++;
        }

        if (esSimetrico) {
            System.out.println("Simetrico");
        } else {
            System.out.println("No simetrico");
        }

    }

    public static void arraySuma() {
        int[][] arrayUno = new int[3][3];
        int[][] arrayDos = new int[3][3];
        int sumaF = 0;
        int sumaC = 0;
        int c1 = 0, c2 = 0, c3 = 0;
//matriz 1
        for (int i = 0; i < arrayUno.length; i++) {
            for (int j = 0; j < arrayUno.length; j++) {
                arrayUno[i][j] = i + 1;
            }
        }
//matriz 2
        for (int i = 0; i < arrayDos.length; i++) {
            for (int j = 0; j < arrayDos.length; j++) {
                arrayDos[i][j] = i + 1;
            }
        }

// mostrar matriz
        System.out.println("matriz 1");
        for (int i = 0; i < arrayUno.length; i++) {
            for (int j = 0; j < arrayUno.length; j++) {
                System.out.print(arrayUno[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("matriz 2");

        for (int i = 0; i < arrayDos.length; i++) {
            for (int j = 0; j < arrayDos.length; j++) {
                System.out.print(arrayUno[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arrayUno.length; i++) {
            sumaC = 0;
            for (int j = 0; j < arrayUno.length; j++) {
                System.out.print(arrayUno[i][j] + "." + arrayDos[i][j] + "  ");
                sumaF += arrayUno[i][j] + arrayDos[i][j];
                sumaC += arrayUno[j][i] + arrayUno[j][i];
                if (sumaC > c1 && c1 == c1) {
                    c1 = sumaC;
                } else if (sumaC > c2 && c2 == c2) {
                    c2 = sumaC;
                } else if (sumaC > c3 && c3 == c3) {
                    c3 = sumaC;
                }
            }
            System.out.print(" " + sumaF);
            sumaF = 0;
            System.out.println();
        }
        System.out.println(" " + c1 + "   " + c2 + "  " + c3);
    }

    public static void arrayDiagonal() {
        int[][] arrayDiagonal = new int[7][7];
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < arrayDiagonal.length; i++) {
            for (int j = 0; j < arrayDiagonal.length; j++) {
                if (i == j) {
                    arrayDiagonal[i][j] = 1;
                    System.out.print(arrayDiagonal[i][j] + "   ");
                }
                arrayDiagonal[i][j] = 0;
                System.out.print(arrayDiagonal[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void arrayMarco() {
        int[][] arrayMarco = new int[8][6];
        for (int i = 0; i < arrayMarco.length; i++) {
            for (int j = 0; j < arrayMarco[i].length; j++) {
                if (j == 0 || i == 0 || i == arrayMarco.length - 1
                        || j == arrayMarco[i].length - 1) {
                    arrayMarco[i][j] = 1;
                    System.out.print(arrayMarco[i][j] + "     ");
                } else {
                    arrayMarco[i][j] = 0;
                    System.out.print(arrayMarco[i][j] + "     ");
                }
            }
            System.out.println();
        }
    }

    public static void arrayMarcoCreado() {
        Scanner read = new Scanner(System.in);
        int fila, columna;

        System.out.println("Dame el número de filas y luego de columanas: ");
        fila = read.nextInt();
        columna = read.nextInt();
        int[][] arrayMarcoCreado = new int[fila][columna];

        for (int i = 0; i < arrayMarcoCreado.length; i++) {
            for (int j = 0; j < arrayMarcoCreado[i].length; j++) {
                if (j == 0 || i == 0 || i == arrayMarcoCreado.length - 1
                        || j == arrayMarcoCreado[i].length - 1) {
                    arrayMarcoCreado[i][j] = 1;
                    System.out.print(arrayMarcoCreado[i][j] + "     ");
                } else {
                    arrayMarcoCreado[i][j] = 0;
                    System.out.print(arrayMarcoCreado[i][j] + "     ");
                }
            }
            System.out.println();
        }

    }
}
