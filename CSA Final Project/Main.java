public class Main implements Runnable {
    
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
        while(terminator == false) {
            if (System.nanoTime() - xTime >= 10000000) {
                //screen refresh rate = 0.01 seconds    
                gui.refresher();
                gui.repaint();
                //paint frame again
                xTime = System.nanoTime();
            }
        }
    }
    
    public static void setPWins(int wins){
        pWins = wins;
    }
    
    public static void setTerminator(boolean terminate){
        terminator = terminate;
    }
    
    public static void setDWins(int wins){
        dWins = wins;
    }
    
    public static int getPWins(){
       return pWins;
    }
    
    public static int getDWins(){
       return dWins;
    }
    
    public static boolean getTerminator(){
       return terminator;
    }
}