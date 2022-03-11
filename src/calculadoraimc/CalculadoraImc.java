
package calculadoraimc;
import java.util.Scanner;


public class CalculadoraImc {

   
    public static void main(String[] args) {
        
        
        float peso;
        float altura;
        float imc;

        String resp = "";
        
        Scanner teclado = new Scanner(System.in);


       


        System.out.println("========================================");
        System.out.println("              BEM VINDO!                ");
        System.out.println("========================================");
        System.out.println("");
        
        
        do{
        System.out.println("========================================");
        System.out.println("");
        System.out.print("Digite seu peso em KG (ex: 69,2): ");
        peso = teclado.nextFloat();
        System.out.println("---------------------------------------");
        System.out.print("Digite sua altura em M (ex: 1,70): ");
        altura = teclado.nextFloat();
        System.out.println("========================================");
        System.out.println("");

        imc = (peso / (altura * altura));

        if (imc < 17){
            System.out.println("Você está muito abaixo do peso ideal.");
            System.out.format("Seu IMC é de %.2f\n", imc);
            System.out.println("========================================");
            System.out.println("");

        }else if (imc >= 17 && imc < 18.5){
            System.out.println("Você esta abaixo do peso ideal.");
            System.out.format("Seu IMC é de %.2f\n", imc);
            System.out.println("========================================");
            System.out.println("");

        }else if (imc >= 18.5 && imc < 25){
            System.out.println("Você está no peso ideal.");
            System.out.format("Seu IMC é de %.2f\n", imc);
            System.out.println("========================================");
            System.out.println("");

        }else if (imc >= 25 && imc < 30){
            System.out.println("Você está com sobrepeso.");
            System.out.format("Seu IMC é de %.2f\n", imc);
            System.out.println("========================================");
            System.out.println("");


        }else if (imc >= 30 && imc < 35){
            System.out.println("Você está com obesidade.");
            System.out.format("Seu IMC é de %.2f\n", imc);
            System.out.println("========================================");
            System.out.println("");

        }else if (imc >= 35 && imc < 40){
            System.out.println("Você está com obesidade severa.");
            System.out.format("Seu IMC é de %.2f\n", imc);
            System.out.println("========================================");
            System.out.println("");

        }else if (imc > 40){
            System.out.println("Você está com obesidade morbida.");
            System.out.format("Seu IMC é de %.2f\n", imc);
            System.out.println("========================================");
            System.out.println("");

        }else{
        }

        System.out.print("Deseja calcular novamente? [S/N]: ");
        resp = teclado.next();
    }while(resp.equals("S") || resp.equals("s"));

    System.out.println("Volte sempre!!"); 

                             
        teclado.close();  
    }
}
    

