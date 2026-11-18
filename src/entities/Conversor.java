package entities;

public class Conversor {
    // 1. Atributos Privados (Encapsulamento: trancados a sete chaves)
    private double taxaDolar;
    private double taxaEuro;

    public Conversor(double taxaDolar, double taxaEuro) {
        // 2. Construtor (Prepara o objeto assim que ele nasce)
        this.taxaDolar = taxaDolar;
        this.taxaEuro = taxaEuro;
    }

    // 3. Métodos de Ação (Abertos ao público)
    public double realParaDolar(double valoresReais){
            return valoresReais / this.taxaDolar;
    }

    public double realParaEuro(double valoresReais){
        return valoresReais / this.taxaEuro;
    }

    // 4. Getters e Setters (A única forma de ler ou alterar os dados trancados)
    // Se a cotação mudar no meio do dia, usamos este metodo para atualizar de forma segura

    public double getTaxaDolar() {
        return taxaDolar;
    }

    public void setTaxaDolar(double novaTaxa) {
        if(novaTaxa > 0){
            this.taxaDolar = novaTaxa;
        }else{
            System.out.println("Erro: A taxa não pode ser zero ou negativa.");
        }
    }
}
