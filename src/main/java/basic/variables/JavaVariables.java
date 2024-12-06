package basic.variables;

/**
 * Java의 기본 데이터 타입과 변수 사용 예제
 */
public class JavaVariables {
    public static void main(String[] args) {
        // 정수형 변수
        byte byteNum = 127;         // -128 ~ 127
        short shortNum = 32767;     // -32,768 ~ 32,767
        int intNum = 2147483647;    // -2,147,483,648 ~ 2,147,483,647
        long longNum = 9223372036854775807L;  // 끝에 L을 붙임
        
        // 실수형 변수
        float floatNum = 3.14f;     // 끝에 f를 붙임
        double doubleNum = 3.141592653589793;
        
        // 문자형 변수
        char charValue = 'A';
        
        // 논리형 변수
        boolean isTrue = true;
        
        // 문자열 (참조형)
        String message = "Hello, Java!";
        
        // 변수값 출력
        System.out.println("=== 정수형 변수 ===");
        System.out.println("byte: " + byteNum);
        System.out.println("short: " + shortNum);
        System.out.println("int: " + intNum);
        System.out.println("long: " + longNum);
        
        System.out.println("\n=== 실수형 변수 ===");
        System.out.println("float: " + floatNum);
        System.out.println("double: " + doubleNum);
        
        System.out.println("\n=== 문자형 변수 ===");
        System.out.println("char: " + charValue);
        
        System.out.println("\n=== 논리형 변수 ===");
        System.out.println("boolean: " + isTrue);
        
        System.out.println("\n=== 문자열 변수 ===");
        System.out.println("String: " + message);
    }
}