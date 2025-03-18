public class Pessoas {
    String nome;
    int idade;
    String cpf;
    double altura;
    String faculdade;

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", altura=" + altura +
                ", faculdade='" + faculdade + '\'' +
                '}';
    }
}