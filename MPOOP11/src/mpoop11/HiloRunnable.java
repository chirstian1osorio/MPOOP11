package mpoop11;
/**
 *
 * @author alfre
 */
public class HiloRunnable implements Runnable {

    public HiloRunnable() {
    }
    
    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < 10; i++) {
            System.out.println("iteracion "
                    + ""+i+" de "+Thread.currentThread().getName());

        }
        System.out.println("termina el "
                + ""+Thread.currentThread().getName());
    }
    
    
}
