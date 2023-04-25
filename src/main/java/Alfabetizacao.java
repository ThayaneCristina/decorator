public class Alfabetizacao extends HorarioDecorator {

    public Alfabetizacao(Horario horario){
        super(horario);
    }

    public String getNomeEstrutura() {
        return "Alfabetização";
    }
}
