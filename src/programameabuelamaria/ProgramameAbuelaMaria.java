/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programameabuelamaria;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class ProgramameAbuelaMaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent=new Scanner(System.in);
        
        long casos=Long.valueOf(ent.nextLine());
        while(casos-->0){
            boolean sonrisa=true;
            long suma=0;
            String[] arriba=ent.nextLine().split(" ");
            String[] abajo=ent.nextLine().split(" ");
            for (int i = 0; i < abajo.length && sonrisa; i++) {
                if(i==0){
                    suma = Long.valueOf(arriba[i])+Long.valueOf(abajo[i]);
                }else{
                    sonrisa=(suma==Long.valueOf(arriba[i])+Long.valueOf(abajo[i]));
                }
            }
            if(sonrisa) System.out.println("SI");
            else System.out.println("NO");
        
        
        }
    }
    
}
