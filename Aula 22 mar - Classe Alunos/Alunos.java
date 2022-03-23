
package aulasemana.pkg7;


public class Alunos {
    
    // Atributos da classe ...
    private String nome;
    private String matricula;
    private float notaProva;
    private float notaTrabalho;
    
    // Construtor: atalho alt + insert
    public Alunos(String nome, String matricula, float notaProva, float notaTrabalho) {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setNotaProva(notaProva);
        this.setNotaTrabalho(notaTrabalho);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(float notaProva) {
        
        if (notaProva < 0){
            this.notaProva = 0;
        } else {
            this.notaProva = notaProva;
        }
        
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        if (notaTrabalho < 0){
            this.notaTrabalho = 0;
        } else {
            this.notaTrabalho = notaTrabalho;
        }
    }
    
    // Método de cálculo da média ponderada:
    public float calcularMediaFinal() {
        return ((notaProva*5 + notaTrabalho*5)/10);
    }
}

