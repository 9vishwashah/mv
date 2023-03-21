public class ErrorHandling {

    public static void main(String[] args) {
        try
        {
            int data=50/0; //may throw exception
        }
        // handling the exception
        catch(Exception e)
        {
            // displaying the custom message
            System.out.println(e);
        }

        System.out.println("rest of the code");
    }

}
