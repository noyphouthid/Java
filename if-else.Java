// if-else-in-Java
import java.util.Scanner;

/**
 * ifelse
 */
public class ifelse {
    public static void main(String[] args) {
        Scanner grad = new Scanner(System.in);
        System.out.print("Enter Grad:");
        int Grad = grad.nextInt();

        if (Grad >= 90) {
            System.out.println("Grad = A+");
        } else {
            if (Grad >= 80) {
                System.out.println("Grad = B+");
            } else {
                if (Grad >= 70) {
                    System.out.println("Grad = B");
                } else {
                    if (Grad >= 60) {
                        System.out.println("Grad = C+");
                    } else {
                        if (Grad >= 50) {
                            System.out.println("Grad = C");
                        } else {
                            if (Grad >= 45) {
                                System.out.println("Grad = D+");
                            } else {
                                if (Grad >= 40) {
                                    System.out.println("Grad = D");
                                } else {
                                    System.out.println("Grad = F");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
