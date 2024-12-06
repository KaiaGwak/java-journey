package basic.operators;

/**
 * Java의 기본 연산자 사용 예제
 */
public class JavaOperators {
    public static void main(String[] args) {
        // 산술 연산자
        int a = 10;
        int b = 3;
        
        System.out.println("=== 산술 연산자 ===");
        System.out.println("덧셈: " + (a + b));      // 13
        System.out.println("뺄셈: " + (a - b));      // 7
        System.out.println("곱셈: " + (a * b));      // 30
        System.out.println("나눗셈: " + (a / b));    // 3 (정수 나눗셈)
        System.out.println("나머지: " + (a % b));    // 1
        
        // 증감 연산자
        System.out.println("\n=== 증감 연산자 ===");
        System.out.println("a++: " + a++);    // 10 (출력 후 증가)
        System.out.println("현재 a: " + a);    // 11
        System.out.println("++b: " + ++b);    // 4 (증가 후 출력)
        System.out.println("현재 b: " + b);    // 4
        
        // 비교 연산자
        System.out.println("\n=== 비교 연산자 ===");
        System.out.println("a > b: " + (a > b));     // true
        System.out.println("a < b: " + (a < b));     // false
        System.out.println("a >= b: " + (a >= b));   // true
        System.out.println("a <= b: " + (a <= b));   // false
        System.out.println("a == b: " + (a == b));   // false
        System.out.println("a != b: " + (a != b));   // true
        
        // 논리 연산자
        boolean x = true;
        boolean y = false;
        
        System.out.println("\n=== 논리 연산자 ===");
        System.out.println("AND(x && y): " + (x && y));  // false
        System.out.println("OR(x || y): " + (x || y));   // true
        System.out.println("NOT(!x): " + (!x));          // false
        
        // 대입 연산자
        int c = 20;
        System.out.println("\n=== 대입 연산자 ===");
        System.out.println("원래 값: " + c);
        System.out.println("+=: " + (c += 5));     // c = c + 5
        System.out.println("-=: " + (c -= 3));     // c = c - 3
        System.out.println("*=: " + (c *= 2));     // c = c * 2
        System.out.println("/=: " + (c /= 4));     // c = c / 4
    }
}