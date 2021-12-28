public class palliString {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("sakshi");
        a.reverse();
        String b = a.toString();

        if (b.equals(a)) {
            System.out.println("pallindrome");
        } else {
            System.out.println(" not pallindrome");
        }

    }

}
