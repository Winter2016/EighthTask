package mypckg;

/**
 * Created by Ксения on 4/19/2016.
 */
public class Status {
    String message;

    public Status(String str) {
        if (str.equals("add"))
            message = "Buyer added successfully";
        if (str.equals("delete"))
            message = "Buyer deleted successfully";
        if (str.equals("deleteAll"))
            message = "All buyers deleted successfully";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
