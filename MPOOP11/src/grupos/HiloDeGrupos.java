package grupos;
/**
 *
 * @author alfre
 */
public class HiloDeGrupos extends Thread{

    public HiloDeGrupos(ThreadGroup group, String name) {
        super(group, name);
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("interacion "+i+" de "+getName());
        }
    }
}
