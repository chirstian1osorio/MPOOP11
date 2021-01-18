package actividad;
/**
 *
 * @author alfre
 */
public class cuenta extends Thread {
    private static long saldo=0;

    public cuenta(String name) {
        super(name);
    }
    
    @Override
    public void run(){
       if(getName().equals("deposito 1") ||
               getName().equals("deposito 2")){
           this.depositarDinero(100);
       } else{
           this.extraerDinero(50);
       }
        System.out.println("termina el "+getName());
    }
    
    public synchronized void depositarDinero(int cantidad){
        saldo+= cantidad;
        System.out.println("se depositaron "+cantidad+" pesos");
        notifyAll();
    }
    
    public synchronized void extraerDinero(int cantidad){
        try{
            if(saldo <= 0){
                System.out.println(getName()+" espera deposito"
                +" \nSaldo = "+saldo);
                sleep(5000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
        saldo -=cantidad;
        System.out.println(getName()+" extrajo "+cantidad+
                "pesos \nSaldo restante = "+saldo);
        notifyAll();
    }
}
