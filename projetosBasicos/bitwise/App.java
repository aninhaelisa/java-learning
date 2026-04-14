package projetosBasicos.bitwise;

public class App {
    public static void main(String[] args) {
        int a = 5; // 0101 em binário
        int b = 3; // 0011 em binário

        int andResult = a & b; // AND bit a bit
        int orResult = a | b;  // OR bit a bit
        int xorResult = a ^ b; // XOR bit a bit
        int notAResult = ~a;   // NOT de a

        System.out.println("Bitwise Operations:");
        System.out.println("A: " + a);
        System.out.println("B: " + b); 
        System.out.println("AND: " + andResult); // 1 (0001)
        System.out.println("OR: " + orResult);   // 7 (0111)
        System.out.println("XOR: " + xorResult); // 6 (0110)
        System.out.println("NOT A: " + notAResult); // -6 (1111...1010 em complemento de dois)

        
    }
}
