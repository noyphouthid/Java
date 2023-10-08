import java.util.Scanner; //แม่นไลบาลีของ Scanner

public class scaner {
    public static void main(String[] args) {
        
        Scanner result = new Scanner(System.in); //การฮับค่าจากคีบอด
        System.out.print("Enter Height (m):"); //แสดงข้อความ
        float h = result.nextFloat(); //ตัวแปล h เป็นเก็บค่าจากคีบอด
        System.out.print("Enter Weight (kg):"); //แสดงข้อความ
        float w = result.nextFloat(); //ตัวแปล w เป็นเก็บค่าจากคีบอด
        float result1 = h * w;
        int tax = 2;
        System.out.println(result1 * tax); //แสดงผลลับการคูน
    }
}
