

public class Main {
    public static void main(String[] args){
        TimeDeFutebol time = new TimeDeFutebol("Avai Futebol Clube", "Santa Catarina", 1923);

        Jogador jogador1 = new Jogador("Pedro Henrique Franklim Martins", 22, "Zagueiro", 35);

        Premiacao premiacao1 = new Premiacao("Campeonato Catarinense - Serie B", 1994);
        Premiacao premiacao2 = new Premiacao("Copa Brasilieiro - Serie C", 1991);

        time.adicionarJogador(jogador1);

        time.adicionarPremiacao(premiacao1);
        time.adicionarPremiacao(premiacao2);

        time.mostrarTime();
    }
}
