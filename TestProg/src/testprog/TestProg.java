/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprog;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class TestProg {

    public static void main(String[] args) {
        int[] A = {8,24,3,20,3,17};
        
        
        int nilai,min = 100;
        for (int i=1; i<A.length; i++) {
            for (int j=1; j<A.length; j++) {
                if(i != j) {
                    nilai = A[i] - A[j];
                    if(nilai<min && nilai>=0) {
                        min = nilai;
                    }
                }
            }
        }
        System.out.println(min);
        
    }
    
}
