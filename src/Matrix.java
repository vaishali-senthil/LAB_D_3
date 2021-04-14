import java.util.Scanner;

public class Matrix {
    public static void main(String args[]) {
        System.out.println("sample programs");
        System.out.println("i am vaishali 18MIS0082");
        Input input = new Input();
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println( "1. addition"+"\n"+
                            "2. subtraction"+"\n" +
                            "3. multiplication"+"\n"+
                            "4. type of the matrix");
        int n = scan.nextInt();

        switch(n) {
            case 1:
                input.add();
                break;
            case 2:
                input.sub();
                break;
            case 3:
                input.mul();
                break;
            case 4:
                input.type();
                break;
        }
    }
}

class Input {
    int add() {
        int i, j;

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows of matrix A:");
        int row = scn.nextInt();
        System.out.println("enter the number of columns of matrix A:");
        int col = scn.nextInt();

        int A[][] = new int[row][col];
        System.out.println("enter the matrix values:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                A[i][j] = scn.nextInt();
            }
        }
        System.out.println("matrix A");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println("");
        }

        System.out.println("enter the number of rows of matrix B:");
        int row2 = scn.nextInt();
        System.out.println("enter the number of columns of matrix B:");
        int col2 = scn.nextInt();

        int B[][] = new int[row2][col2];
        System.out.println("enter the matrix values:");
        for (i = 0; i < row2; i++) {
            for (j = 0; j < col2; j++) {
                B[i][j] = scn.nextInt();
            }
        }
        System.out.println("matrix B");
        for (i = 0; i < row2; i++) {
            for (j = 0; j < col2; j++) {
                System.out.print(B[i][j] + "  ");
            }
            System.out.println("");
        }
        //-----------------add--------

        if (row == row2 && col == col2) {
                int C[][] = new int[row][col];
                System.out.println("addition of the matrix is ");
                for (i = 0; i < row2; i++) {
                    for (j = 0; j < col2; j++) {
                        C[i][j] = A[i][j] + B[i][j];
                        System.out.print(C[i][j] + "  ");
                    }
                    System.out.println("");
                }
            } else {
                System.out.println("doesnt not apply addition for variant columns and rows");
            }
            return 0;

            //-----------------------------
        }
    int sub(){
    int i, j;

    Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows of matrix A:");
    int row = scn.nextInt();
        System.out.println("enter the number of columns of matrix A:");
    int col = scn.nextInt();

    int A[][] = new int[row][col];
        System.out.println("enter the matrix values:");
        for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            A[i][j] = scn.nextInt();
        }
    }
        System.out.println("matrix A");
        for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            System.out.print(A[i][j] + "  ");
        }
        System.out.println("");
    }

        System.out.println("enter the number of rows of matrix B:");
    int row2 = scn.nextInt();
        System.out.println("enter the number of columns of matrix B:");
    int col2 = scn.nextInt();

    int B[][] = new int[row2][col2];
        System.out.println("enter the matrix values:");
        for (i = 0; i < row2; i++) {
        for (j = 0; j < col2; j++) {
            B[i][j] = scn.nextInt();
        }
    }
        System.out.println("matrix B");
        for (i = 0; i < row2; i++) {
        for (j = 0; j < col2; j++) {
            System.out.print(B[i][j] + "  ");
        }
        System.out.println("");
    }
    //-----------------sub--------

        if (row == row2 && col == col2) {
        int C[][] = new int[row][col];
        System.out.println("subtraction of the matrix is ");
        for (i = 0; i < row2; i++) {
            for (j = 0; j < col2; j++) {
                C[i][j] = A[i][j] - B[i][j];
                System.out.print(C[i][j] + "  ");
            }
            System.out.println("");
        }
    } else {
        System.out.println("doesnt not apply subtraction for variant columns and rows");
    }
            return 0;
   }
    int mul(){
        int i, j;

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows of matrix A:");
        int row = scn.nextInt();
        System.out.println("enter the number of columns of matrix A:");
        int col = scn.nextInt();

        int A[][] = new int[row][col];
        System.out.println("enter the matrix values:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                A[i][j] = scn.nextInt();
            }
        }
        System.out.println("matrix A");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println("");
        }

        System.out.println("enter the number of rows of matrix B:");
        int row2 = scn.nextInt();
        System.out.println("enter the number of columns of matrix B:");
        int col2 = scn.nextInt();

        int B[][] = new int[row2][col2];
        System.out.println("enter the matrix values:");
        for (i = 0; i < row2; i++) {
            for (j = 0; j < col2; j++) {
                B[i][j] = scn.nextInt();
            }
        }
        System.out.println("matrix B");
        for (i = 0; i < row2; i++) {
            for (j = 0; j < col2; j++) {
                System.out.print(B[i][j] + "  ");
            }
            System.out.println("");
        }
        //-----------------mul--------

        if (row == row2 && col == col2) {
            int C[][] = new int[row][col];
            System.out.println("multiplication of the matrix is ");
            for (i = 0; i < row2; i++) {
                for (j = 0; j < col2; j++) {
                    C[i][j] = A[i][j] * B[i][j];
                    System.out.print(C[i][j] + "  ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("doesnt not apply multiplication for variant columns and rows");
        }
        return 0;
    }
    int type(){
        int i, j;

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows of matrix A:");
        int row = scn.nextInt();
        System.out.println("enter the number of columns of matrix A:");
        int col = scn.nextInt();

        int A[][] = new int[row][col];
        System.out.println("enter the matrix values:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                A[i][j] = scn.nextInt();
            }
        }
        System.out.println("matrix A");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(A[i][j] + "  ");

            }
            System.out.println("");
        }
        int sym_count = 0;
        if (row == col) {
            System.out.println("its a square matrix");
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (A[i][j] == A[j][i]) {
                    sym_count++;
                    //System.out.println("its a symmetric matrix");
                }

            }
        }
        if (sym_count == row*col)
            System.out.println("Symmetric Mat");
        //A = [[1,0,0],[0,2,0],[0,0,3]]
        //A.length : 3
        //A[0].length: 3
        // Diagonal Matrix function
        int r = A.length-1;
        int dia_count = 0;
        while (r >= 0){
            int c = A[0].length-1;
            while (c >= 0) {
                if (r == c) {
                    if (A[r][c] != 0)
                        dia_count++;
                } else {
                    if (A[r][c] == 0)
                        dia_count++;
                }
                c--;
            }
            r--;
        }
        //System.out.println(dia_count);
        if (dia_count == row*col)
            System.out.println("Diagonal Mat");
        return 0;
    }
}
