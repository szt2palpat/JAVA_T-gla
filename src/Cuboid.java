import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner n=new Scanner(System.in);
        System.out.println("Add meg az első oldalt:");
        a=n.nextDouble();
        System.out.println("Add meg az második oldalt:");
        b=n.nextDouble();
        System.out.println("Add meg az harmadik oldalt:");
        c=n.nextDouble();
        double felszín=2*(a*b+a*c+c*b);
        double térfogat=a*b*c;
        System.out.println((double) felszín+","+térfogat);


    }
}