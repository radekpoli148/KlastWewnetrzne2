/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package klasywewnetrzne2;

public class Klasywewnetrzne2 {

    public static void main(String[] args) {
        KontoBankowe kontoBankowe =new KontoBankowe(1000);
        System.out.println(kontoBankowe.getStanKonta());
        
        kontoBankowe.start(5);
        System.out.println(kontoBankowe.getStanKonta());
    }
    
}

class KontoBankowe
{
    private double stanKonta;

    public KontoBankowe(double stanKonta) 
    {
        this.stanKonta = stanKonta;
    }
    
    
    double getStanKonta()
    {
        return this.stanKonta;
    }
    
    void start(double stopa)
    {
        Odsetki odsetki = new Odsetki(stopa);
    }
    
    class Odsetki
    {
        private double stopaProcentowa;
        
        public Odsetki(double stopaProcentowa)
        {
            this.stopaProcentowa = stopaProcentowa;
            this.zmienStanKonta(stopaProcentowa);
        }
        
        void zmienStanKonta(double stopa)
        {
            double odsetki = (stanKonta * stopa) / 100;
            stanKonta += odsetki;
        }
    }
}