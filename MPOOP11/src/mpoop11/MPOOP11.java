package mpoop11;
/**
 *
 * @author alfre
 */
public class MPOOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HiloThread hilo1=new HiloThread("primer hilo");
        hilo1.start();
        new HiloThread("segundo hilo").start();
        System.out.println("termina el hilo principal");
        
        new Thread(new HiloRunnable(),"tercer hilo").start();
        new Thread(new HiloRunnable(),"cuarto hilo").start();

    }
    
}
