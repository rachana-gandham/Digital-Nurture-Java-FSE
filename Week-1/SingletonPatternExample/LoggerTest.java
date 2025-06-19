public class LoggerTest{
    public static void main(String[] args){
        Logger l1=Logger.getInstance();
        Logger l2=Logger.getInstance();

        l1.log("First Log");
        l2.log("Second Log");

        if(l1!=l2){
            System.out.println("Logger1 and Logger2 are different instances.");
        }
        else{
            System.out.println("Both Logger 1 and Logger 2 are refer to the same instance");
        }
    }
}