/*
Data: 18/03/2022 - 25/03/2022
Autor: Pacer Sylvio Carneiro Júnior
Função: Práticas de programação orientada a objetos - Criação de classes
e métodos conforme orientado na plataforma do curso.
 */
package projetosemana07;


public class ProjetoSemana07 {

    
    public static void main(String[] args) {
        
        // Primeira instância: dev Junior José da Silva, salário mensal R$ 5.000,00
        Empregado devJunior = new Empregado("José", "da Silva", 5000.0f);
        System.out.println("O salário anual de " + devJunior.getPrimeiroNome() + " " + devJunior.getSobrenome() + " é R$ " + devJunior.calcularSalarioAnual());
        System.out.println("Será concedido um aumento de 10% a " + devJunior.getPrimeiroNome() + " " + devJunior.getSobrenome());
        devJunior.concederAumento();
        System.out.println("Novo salário mensal de " + devJunior.getPrimeiroNome() + " " + devJunior.getSobrenome() + ": R$ " + devJunior.getSalarioMensal());
        System.out.println("Após o aumento, o salário anual de " + devJunior.getPrimeiroNome() + " " + devJunior.getSobrenome() + " é R$ " + devJunior.calcularSalarioAnual());
        
        System.out.println();
        
        // Segunda instância: dev Senior Maria da Silva, salário mensal R$ 10.000,00
        Empregado devSenior = new Empregado("Maria", "da Silva", 10000.0f);
        System.out.println("O salário anual de " + devSenior.getPrimeiroNome() + " " + devSenior.getSobrenome() + " é R$ " + devSenior.calcularSalarioAnual());
        System.out.println("Será concedido um aumento de 10% a " + devSenior.getPrimeiroNome() + " " + devSenior.getSobrenome());
        devSenior.concederAumento();
        System.out.println("Novo salário mensal de " + devSenior.getPrimeiroNome() + " " + devSenior.getSobrenome() + ": R$ " + devSenior.getSalarioMensal());
        System.out.println("Após o aumento, o salário anual de " + devSenior.getPrimeiroNome() + " " + devSenior.getSobrenome() + " é R$ " + devSenior.calcularSalarioAnual());
        
        System.out.println();
        System.out.println("Blumenau, 20 de março de 2022.");
        System.out.println("Pacer Sylvio Carneiro Júnior - Pacetech");
    }
    
}
