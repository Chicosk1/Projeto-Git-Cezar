import java.util.Scanner;
public class App {
    public static double Soma(double a, double b){
        return a + b;
    }
    public static double Subtração(double a, double b){
        return a - b;
    }
    public static double Multiplicação(double a, double b){
        return a * b;
    }
    public static double Divisão(double a, double b){
        if (b == 0){
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
    public static void main(String[] args) throws Exception {
        String continuar = "SIM";
        boolean validação = true;
        do{
        double a, b;
        Scanner sc = new Scanner(System.in);
        while (validação) {
        System.out.println("Informe a operação que você deseja realizar:");
        System.out.println("1 - Soma                2 - Subtração");
        System.out.println("3 - Multiplicação       4 - Divisão");
        int op = sc.nextInt();
            if (op >= 1 && op <= 4) {
                System.out.println("Informe o valor de 'a': ");
                a = sc.nextDouble();
                System.out.println("Informe o valor de 'b': ");
                b = sc.nextDouble();
            }
            switch (op) {
                case 1:
                    System.out.println("O valor da soma entre 'a' e 'b' é: "+Soma(a, b));
                    validação = false;
                    break;
        }
    }
            System.out.println("Deseja continuar as operações matemáticas?(SIM/NÃO)");
            continuar = sc.next();
        }while(continuar.equalsIgnoreCase("SIM"));
    
    }
}
