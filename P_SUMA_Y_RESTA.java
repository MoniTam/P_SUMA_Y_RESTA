/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_suma_y_resta;

/**
 *
 * @author ESTEFANIA TAMAY
 */
public class P_SUMA_Y_RESTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("OPERACIONES BASICAS DE PILAS");
        int numero;
        numero =1;
        
        int [] Pila1 = new int[numero];
        int [] Pila2 = new int[numero];
        int [] Pila3 = new int[numero];
        int [] Pila4 = new int[numero];
        int [] Pila5 = new int[numero];
        int [] sumaPila = new int [numero];
        int [] restaPila = new int [numero];
        
        for(int  p = 0; p < numero; p++){}
       
        int p = 0;

        Pila1[p] = (int) (Math.random() + 10 + 15);
        System.out.println("Suma (10) , Suma(15) = " + Pila1[p]);
        
        Pila2[p] = (int) (Math.random() + 25 - 5);
        System.out.println("Suma (15) , Resta(5) = " + Pila2[p]);
  
        Pila3[p] = (int) (Math.random() +  25 + 0);
        System.out.println("Cancelar() = " + Pila3[p]);
   
        Pila4[p] = (int) (Math.random() +  20 + 15);
        System.out.println("Resta(5) , Suma(15) = " + Pila4[p]);
  
        for (int s = 0; s<numero; s++){
        
        sumaPila[s]=Pila1[s] + Pila2[s] + Pila3[p] + Pila4[p];
   
        }
        
        int s = 0;

        System.out.println("Total general de la pila:"  + sumaPila[s] );
          
        
     }
}
    
    

