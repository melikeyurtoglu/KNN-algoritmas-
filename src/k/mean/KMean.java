/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k.mean;


import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author kripton
 */
public class KMean {

    /**
  
     * @param args the command line arguments
     *
     */
     public static double uzaklikhesapla(Kordinaat k1,Kordinaat k2){
        Uzaklik uz= new Uzaklik();
        uz.uzak=Math.sqrt(Math.pow((k2.x-k1.x),2)+Math.pow((k2.y-k1.y),2));
        
        return uz.uzak;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList uzakliklistesi= new ArrayList();
        ArrayList kordinaatlistesi= new ArrayList();
        Scanner input= new Scanner (System.in);
        int ka;
        Kordinaat k1=new Kordinaat();
        Kordinaat k2=new Kordinaat();
        Kordinaat k3=new Kordinaat();
        Kordinaat k4=new Kordinaat();
        Kordinaat k5=new Kordinaat();

        k1.setx(7);
        k1.sety(7);
        k1.setsinif("SinifA");
        kordinaatlistesi.add(k1);
        
        k2.setx(7);
        k2.sety(4);
        k2.setsinif("SinifA");
        kordinaatlistesi.add(k2);
        
        k3.setx(3);
        k3.sety(4);
        k3.setsinif("SinifB");
        kordinaatlistesi.add(k3);
        
        k4.setx(1);
        k4.sety(4);
       
        
        System.out.println("Bir k değeri giriniz[1-3]");
        ka=input.nextInt();
        input.close();
        
        

        
        for(int i=0 ;i< kordinaatlistesi.size();i++){
            Uzaklik uza= new Uzaklik();
            uza.uzak= uzaklikhesapla(k4, (Kordinaat)kordinaatlistesi.get(i));
            uzakliklistesi.add(uza);
        }
        
        
        /*for(int i=0;i<uzakliklistesi.size()-1;i++){
            for(int j=0;j<uzakliklistesi.size()-i;j++){
    
                Uzaklik u= new Uzaklik();
                Uzaklik u1= new Uzaklik();
                Uzaklik a=new Uzaklik();

                 u= (Uzaklik) uzakliklistesi.get(j+1);
                 u1=  (Uzaklik) uzakliklistesi.get(j);
                 
                if(u.uzak<u1.uzak){
                    a.uzak=u1.uzak;
                    u1.uzak=u.uzak;
                    u.uzak=a.uzak;
                }
            }
        }*/
        Collections.sort(uzakliklistesi, new uzakagoresirala());
        int a=0;
         int b=0;
       for (int i = 0; i < ka; i++)
                {
                    
                    if (uzakliklistesi.get(i).sinifi == "SinifA") {a++;}
                    else if (uzakliklistesi.get(i).sinifi == "SinifB") {b++;}
                }
       
                if (a > b)
                {
                    k4.sinif = "sinifA";
                    
                }
                else 
                {
                    k4.sinif = "sinifB";
                }
                
                kordinaatlistesi.add(k4);
                for (int i=0;i<kordinaatlistesi.size();i++)
                {
                    System.out.println(kordinaatlistesi.get(i).x + " " + kordinaatlistesi.get(i).y + " " + kordinaatlistesi.get(i).sinif);;
                }
        }
       
}
