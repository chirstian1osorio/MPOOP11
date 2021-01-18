package mpoop11;
/**
 *
 * @author alfre
 */
public class HiloThread extends Thread{

    public HiloThread(String nombre) {
        super(nombre);
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("iteracion "+i+" de "+getName());
        }
        System.out.println("termina el "+getName());
    }
}
