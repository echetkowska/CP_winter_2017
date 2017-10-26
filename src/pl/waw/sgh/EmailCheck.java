package pl.waw.sgh;

public class EmailCheck {
    public static void main(String[] args) {
        final String EMAIL_OK = "user@sgh.pl";
        final String EMAIL_NOT_OK1 = "@sgh.pl";

        String email = EMAIL_NOT_OK1;

        int a;
        if (email.startsWith("@"))
            a=1;
        else
            a=0;

        int b;
        if (email.contains("@"))
            b=0;
        else
            b=1;

        int c;
        if (email.endsWith("@"))
            c=1;
        else
            c=0;

        int d;
        if (email.startsWith("."))
            d=1;
        else
            d=0;

        int e;
        if (email.contains("."))
            e=0;
        else
            e=1;

        int f;
        if (email.endsWith("."))
            f=1;
        else
            f=0;

if (a+b+c+d+e+f==0)
            System.out.println("ok");
            else System.out.println("not ok");

        }

    }


