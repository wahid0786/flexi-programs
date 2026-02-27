
class excep {

    public static void main(String[] args) {
        String s = "";

        try {
            System.out.println(getlength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegealArgumentException Caught");
        }

        s = "Geeksforgeeeks";

        try {
            System.out.println(getlength(s));

        } catch (IllegalArgumentException e) {
            System.out.println("IllegealArgumentException Caught");
        }
        s = null;

        try {
            System.out.println(getlength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegealArgumentException Caught");
        }
    }

    public static int getlength(String s) throws IllegalArgumentException {
        if (s == null) {
            throw new IllegalArgumentException("Argument cannot be null");
        }
        return s.length();
    }
}
