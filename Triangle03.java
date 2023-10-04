    import java.util.Scanner;

public class Triangle03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, weight;
        float area;
        System.out.print("Input base: ");
        base = sc.nextInt();
        System.out.print("Input height: ");
        weight = sc.nextInt();
        area = base * weight / 2;
        System.out.println("Area of the triangle: " + area);
        
    }
}

