public class Matematica extends HorarioDecorator{

    public Matematica(Horario horario){
        super(horario);
    }

    public String getNomeEstrutura(){
        return "Matemática";
    }

}
