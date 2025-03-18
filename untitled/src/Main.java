public class Main {
    public static void main(String[] args) {

        Pessoas leandro = new Pessoas();

        leandro.nome = "Leandro";
        leandro.cpf = "123.123.123-21";
        leandro.idade = 18;
        leandro.altura = 1.70;
        leandro.faculdade = "Fiap";

        Pessoas Richard = new Pessoas();

        Richard.nome = "Richard";
        Richard.cpf = "123.123.123-21";
        Richard.idade = 19;
        Richard.altura = 1.75;
        Richard.faculdade = "Fiap";



        System.out.println(leandro.altura);
        System.out.println(Richard.nome);
    }
}