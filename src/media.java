import java.util.Scanner;

import Classes.Aluno;

public class media {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        Double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        Double nota2 = sc.nextDouble();

        Aluno a1 = new Aluno(nota1, nota2);

        Double sum = nota1 + nota2;
        Double media = sum /2;

        System.out.println("Sua media é: " + media);
        
    }
}
