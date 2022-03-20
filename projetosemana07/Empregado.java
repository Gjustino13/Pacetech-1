package projetosemana07;

public class Empregado {
    
    // Atributos da classe ...
    private String primeiroNome;
    private String sobrenome;
    private float salarioMensal;

    // Método construtor: atalho alt + insert
    public Empregado(String primeiroNome, String sobrenome, float salarioMensal) {
        this.setPrimeiroNome(primeiroNome);
        this.setSobrenome(sobrenome);
        this.setSalarioMensal(salarioMensal);
    }

    // Métodos de acesso:
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        if (salarioMensal < 0) {
            this.salarioMensal = 0;
        } else {
        this.salarioMensal = salarioMensal;
        }
    }
    
    // Método para calcular salário anual:
    public float calcularSalarioAnual() {
        return (12 * salarioMensal);
    }
    
    // Método para conceder aumento de 10%:
    public float concederAumento() {
        salarioMensal = (1.1f * salarioMensal);
        return salarioMensal;
    }
    
}
