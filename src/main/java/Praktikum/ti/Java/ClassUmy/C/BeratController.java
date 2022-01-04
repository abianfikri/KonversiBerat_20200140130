/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.ti.Java.ClassUmy.C;

import ProsesCompute.KonversiBerat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Abian
 */
@Controller
public class BeratController {
    
    KonversiBerat data = new KonversiBerat();
    
    @RequestMapping("/gram")
    public String getGram(Model model){
        String display,out;
        
        double hasil,berat;
        
        berat = 123;
        hasil = data.kilogramToGram(berat);
        
        display = berat + " Kg" + " = " + hasil + " gram";
        
        
        model.addAttribute("Nilai", display);
        
        
        return "outputKonversi";
    }
    
    @RequestMapping("/ons")
    public String getOns(Model model){
        String display;
        
        double hasil,berat;
        
        berat = 142;
        hasil = data.KilogramToOns(berat);
        
        display = berat + " Kg" + " = " + hasil + " Ons";
        
        
        model.addAttribute("Nilai", display);
        
        
        return "outputKonversi";
    }
    
    @RequestMapping("kg")
    public String getKg(Model model){
        String display;
        
        double hasil,berat;
        
        berat = 1560; 
        hasil = data.GramToKilogram(berat);
        
        display = berat + " gram" + " = " + hasil + " Kg";
        
        
        model.addAttribute("Nilai", display);
        
        return "outputKonversi";
    }
}
