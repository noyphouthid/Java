public class Intro {
    public static float A(float height, float weight){
        return weight / (height * height);
    }
    public static void main(String[] args) {
      System.out.println(A(4, 80));
    }
}