/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.ti.Java.ClassUmy.C;

import ProsesCompute.KonversiSuhu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Abian
 */
@Controller
public class KonversiController {
    
    // Pembuatan Objek
    KonversiSuhu data = new KonversiSuhu();
    
    @RequestMapping("/fahreinhit")
    public String CelsciusToFahreihit(Model model){
        String display;
        
        int value,hasil;
        
        // Input data
        value =150;
        hasil = data.celciusToFahrenhit(value);
        
        // Compute
        
        display = value + " C" +" = " + hasil + " F "  ;
        
        
        // Menampilkan data dengan menggunakan model
        model.addAttribute("Nilai", display);
        
        // Menampilkan di template "outputHasil
        return"outputKonversi";
    }
    
    @RequestMapping("/reamur")
    public String celciusToReamur(Model model){
        String display;
        
        int value,hasil;
        
        // Input data
        value = 102;
        hasil = data.celciusToReamur(value);
        
        // Compute
        
        display = value + " C" + " = " + hasil + " R ";
        
        
        // Menampilkan data dengan menggunakan model
        model.addAttribute("Nilai", display);
        
        // Menampilkan di template "outputHasil
        return"outputKonversi";
    }
    
    @RequestMapping("/kelvin")
    public String celciusToKelvin(Model model){
        String display;
        
        int value,hasil;
        
        // Input data
        value = 100;
        hasil = data.celciusToKelvin(value);
        
        // Compute
        
        display = value + " C" + " = " + hasil + " K ";
        
        
        // Menampilkan data dengan menggunakan model
        model.addAttribute("Nilai", display);
       
        
        // Menampilkan di template "outputHasil
        return"outputKonversi";
    }
}
