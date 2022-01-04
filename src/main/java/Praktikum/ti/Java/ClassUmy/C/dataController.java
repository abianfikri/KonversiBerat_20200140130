/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.ti.Java.ClassUmy.C;

import ProsesCompute.Aritmatika;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author Abian
 */
@Controller
public class dataController {
    
    // Mmembuat Objek baru dari kelas Aritmatika pada Packege baru
    Aritmatika data = new Aritmatika();
    
    @RequestMapping("/tambah")
    public String Penjumlahan(Model model){
        
        String display;
        
        int angka1,angka2,hasil;
        
        angka1 = 5;
        angka2 = 6;
        hasil = data.getAdd(angka1, angka2);
        
        
        display = "Penjumlahan : " + angka1 + " + " + angka2 + " = " + hasil;
        
        model.addAttribute("Nilai",display);
        
        return "outputHasil";
        
    }
    
    @RequestMapping("/kurang")
    public String Pengurangan(Model model){
        
        String display;
        
        int angka1,angka2,hasil;
        
        angka1 = 25;
        angka2 = 6;
        hasil = data.getSub(angka1, angka2);
        
        display = "Pengurangan : " + angka1 + " - " + angka2 + " = " + hasil;
        
        model.addAttribute("Nilai",display);
        
        return "outputHasil";
        
    }
    
    @RequestMapping("/time")
    public String Perkalian(Model model){
        
        String display;
        
        int angka1,angka2,hasil;
        
        angka1 = 5;
        angka2 = 12;
        hasil = data.getTime(angka1, angka2);
        
        display = "Perkalian : " + angka1 + " * " + angka2 + " = " + hasil;
        
        model.addAttribute("Nilai",display);
        
        return "outputHasil";
        
    }
    
}
