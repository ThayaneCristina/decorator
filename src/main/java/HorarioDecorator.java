public abstract class HorarioDecorator implements Horario{

    private Horario horario;
    private String estrutura;

    public HorarioDecorator (Horario horario) {
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.horario.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

}
