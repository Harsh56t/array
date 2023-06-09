import java.util.Scanner;
class normal{
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
     System.out.println("press 1 to add");
     System.out.println("press 2 to substract");
     System.out.println("press 3 to multiply");
     System.out.println("press 4 to divide");
     System.out.println("press 5 to modulo");
     System.out.println("press 6 to increment");
     System.out.println("press 7 to decrement");
     int choice = calc.nextInt();
     switch(choice)
     {
        case 1 :
        System.out.println("enter the 1st no");
        int a = calc.nextInt();
        System.out.println("enter the 2nd no");
        int b = calc.nextInt();
        System.out.println("enter the result");
        int c = a+b;
        System.out.println(c);
        break;

        case 2:
        System.out.println("enter the 1st no");
        int d = calc.nextInt();
        System.out.println("enter the 2nd no");
        int e = calc.nextInt();
        System.out.println("enter the result");
        int f = d-e;
        System.out.println(f);
        break;

        case 3:
        System.out.println("enter the 1st no");
        int g = calc.nextInt();
        System.out.println("enter the 2nd no");
        int h = calc.nextInt();
        System.out.println("enter the result");
        int i = g*h;
        System.out.println(i);
        break;

        case 4:
        System.out.println("enter the 1st no");
        int j = calc.nextInt();
        System.out.println("enter the 2nd no");
        int k = calc.nextInt();
        System.out.println("enter the result");
        int l = j/k;
        System.out.println(l);
        break;

        case 5:
        System.out.println("enter the 1st no");
        int m = calc.nextInt();
        System.out.println("enter the 2nd no");
        int n = calc.nextInt();
        System.out.println("enter the result");
        int o = m%n;
        System.out.println(o);
        break;

        case 6:
        System.out.println("enter the no");
        int p = calc.nextInt(); 
        p++;
        System.out.println(p);
        break;

        case 7:
        System.out.println("enter the no");
        int r = calc.nextInt();
        r--;
        System.out.println(r);
        break;
        


     }
     



    }



}

