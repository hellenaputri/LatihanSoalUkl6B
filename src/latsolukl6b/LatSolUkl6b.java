/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsolukl6b;

/**
 *
 * @author maylany hellena
 */
public class LatSolUkl6b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("=========== Latihan 6a ===========");
        int matriksA  [] [] = {{1, 3}, {2, 4}};
        int matriksB  [] [] = {{4, 2}, {3,1}};

        int hasilTambah [] [] = new int [2][2];

        System.out.println("Matriks A + Matriks B");

        for(int i = 0;  i < 2;  i++){
            for(int j = 0;  j < 2; j++){
                hasilTambah[i][j] = matriksA[i][j] + matriksB[i][j];
                System.out.print(hasilTambah[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }


    
}
