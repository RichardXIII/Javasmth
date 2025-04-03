public class Aluno {
    private double notaGS;
    private double notaChallenges;
    private double notaCheckpoint;

    public Aluno(double gs, double challenges, double checkpoint) {
        notaGS = gs;
        notaChallenges = challenges;
        notaCheckpoint = checkpoint;
    }

    public double calcularMedia() {
        double PESO_GS = 0.5;
        double PESO_CHALLENGES = 0.3;
        double PESO_CHECKPOINT = 0.2;

        return (notaGS * PESO_GS) + (notaChallenges * PESO_CHALLENGES) + (notaCheckpoint * PESO_CHECKPOINT);
    }
}


