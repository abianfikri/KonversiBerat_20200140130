/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProsesCompute;

/**
 *
 * @author Abian
 */
public class KonversiSuhu {
        public int celciusToFahrenhit(int value){
        return (9*value)/5+32;
    }
    public int celciusToReamur(int value){
        return  (4 * value) / 5;
    }
    public int celciusToKelvin(int value){
        return (value+273);
    }
    
}
