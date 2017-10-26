package pl.waw.sgh;

public class Conditions {
    public static void main(String[] args) {
        // psvm - skrot
        int b = 6;
        {
            int a = 5;
            System.out.println("Run from a sub block");
            System.out.println("a= "+ a);
        }
        // a block inherits conditions that are inside of it
        // todo smth to do

        boolean myCond = false;

        if (!myCond)
            System.out.println("my Cond is true");

        else {
            System.out.println("myCond is false");
        }

        if (b>=6) {
            System.out.println("b>6");
        }
        String s1 = "abc";
        String s2 = "abc" ;
        String s3 = new String ("abc");

        if (s1==s2) {
            System.out.println("String s1 and s2 are equal");

        }

        //Compare if pointers point to the same object
        //Don't use it to compare values
        if (s1==s3) {
            System.out.println("String s1 and s3 are equal");

        }

        if (s1.equals(s3)) {   //.equals!!!
            System.out.println("String s1 and s3 are equal using equals method");

        }

        if (b>4 && s1.equals(s3)) {
            System.out.println("b>4 and s1 and s3 store the same text");

        }

        int c;
        if (b>4)
            c=b;
        else
            c=2;
        //equivalent of the above
        c = b>4 ? b : 2;
    }
}

