public class Test{
    public static void main(String[] args){
        CookieCanister cookie1 = new CookieCanister("Chocolate chips", 57);
        cookie1.printCookieInfo();
        System.out.println("\n");
        cookie1.add(50);
        System.out.println(cookie1.getNumCookies());
        cookie1.add(23);
        System.out.println(cookie1.getNumCookies());
    }
}