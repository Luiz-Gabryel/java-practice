public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int tempoAtual) {
        return expectedMinutesInOven() - tempoAtual;
    }

    public int preparationTimeInMinutes(int camadas) {
        return 2 * camadas;
    }

    public int totalTimeInMinutes(int camadas, int tempoAtual) {
        return preparationTimeInMinutes(camadas) + tempoAtual;
    }
}
