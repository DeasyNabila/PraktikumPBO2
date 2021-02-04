/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Pohon {
    String nama;
    int tinggi;
    
    
    void setNama (){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nama:");
        nama = input.nextLine();
    
    }
    
    void setTinggi (){   
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan tinggi:");
        tinggi = input.nextInt();
        
    }
    
    public String getNama (){
        return nama;
    }
    
    public int getTinggi (){
        return tinggi;
    }
}
