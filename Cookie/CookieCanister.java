public class CookieCanister{
    
    private String type;
    private int capacity;
    private int numCookies;
    private int status;
    
    public CookieCanister(String theType, int theCapacity){
        type = theType;
        capacity = theCapacity;
        numCookies = 0;
        status = 0;
    }
    
    public void dispense(int amount){
        if(amount<numCookies){
            numCookies-=amount;
        }
        else{
            numCookies=0;
        }
    }
    
    public void add(int amount){
        if((capacity-numCookies)-(numCookies+amount)>0){
            numCookies+=amount;
        }
        else{
            numCookies=capacity;
        }
    }
    
    void fill(){
        numCookies=capacity;
    }
    
    public void empty(){
        numCookies = 0;
    }
    
    public void open(){
        status = 1;
    }
    
    public void close(){
        status = 0;
    }
    
    public String getType(){
        return type;
    }
    
    public String getStatus(){
        if(status==0){
            return "closed";
        }
        else if(status==1){
            return "open";
        }
        else{
            return "Status not specified";  
        }    
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public int getNumCookies(){
        return numCookies;
    }
    
    public void printCookieInfo(){
        System.out.println("Type: " + getType() + "\nCapacity: " + getCapacity() + "\nNumber of Cookies: " + getNumCookies() + "\nStatus: " + getStatus());
    }
    
} 