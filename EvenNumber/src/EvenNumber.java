import java.util.Scanner;

public class EvenNumber {

    static void GenerateEvenNumber() {
        for(int i=2;i<=100;i+=2) {
            System.out.print(i+",");
        }
    }

    public static void main(String[] args) {
        GenerateEvenNumber();
    }
}
