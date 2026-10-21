public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
        public int expectedMinutesInOven(){
            return 40;
        }

    // TODO: define the 'remainingMinutesInOven()' method
        public int remainingMinutesInOven(int tempoAtual) {
            return 40 - tempoAtual;
        }

    // TODO: define the 'preparationTimeInMinutes()' method
        public int preparationTimeInMinutes(int camadas){
            return 2 * camadas;
        }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int camadas, int tempoAtual) {
        return preparationTimeInMinutes(camadas) + tempoAtual;
    }


}
