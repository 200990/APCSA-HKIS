
public class fs implements Runnable {
    long xTime = System.nanoTime();
    private static boolean terminator = false;
    private static int pWins = 0;
    private static int dWins = 0;
    
    GUI gui = new GUI();
    
    public static void main(String[] args) {
        new Thread(new Main()).start();
        //seperate thread
    }

    @Override
    public void run() {
        while(!terminator) {  
                gui.refresher();
                gui.repaint();
                //paint frame again
            }
        }
    }

