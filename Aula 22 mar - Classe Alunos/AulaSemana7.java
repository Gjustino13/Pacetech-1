
package aulasemana.pkg7;


public class AulaSemana7 {

    public static void main(String[] args) {
        
        Alunos aluno1 = new Alunos("Jonathan", "333", 8.0f, 10.0f);
        System.out.println("Média final do aluno " + aluno1.getNome() + ": " 
                + aluno1.calcularMediaFinal());
        Alunos aluno2 = new Alunos("Bruno", "334", 10.0f, 8.0f);
        System.out.println("Média final do aluno " + aluno2.getNome() + ": " 
                + aluno2.calcularMediaFinal());
        
        
        
    }
    
}
