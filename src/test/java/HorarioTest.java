import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HorarioTest {

    @Test
    void deveRetornarEstruturaHorario() {
        HorarioEducacaoInfantil horario = new HorarioEducacaoInfantil();

        assertEquals("Horário Educação Infantil", horario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaHorarioComAlfabetização() {
        Horario horario = new Alfabetizacao(new HorarioEducacaoInfantil());
        assertEquals("Horário Educação Infantil/Alfabetização", horario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaHorarioComArtes() {
        Horario horario = new Artes(new HorarioEducacaoInfantil());
        assertEquals("Horário Educação Infantil/Artes", horario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaHorarioComMatematica() {
        Horario horario = new Matematica(new HorarioEducacaoInfantil());
        assertEquals("Horário Educação Infantil/Matemática", horario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaHorarioComMatematicaMaisArtes() {
        Horario horario = new Matematica(new Artes(new HorarioEducacaoInfantil()));
        assertEquals("Horário Educação Infantil/Artes/Matemática", horario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaHorarioComMatematicaMaisAlfabetizacao() {
        Horario horario = new Matematica(new Alfabetizacao(new HorarioEducacaoInfantil()));
        assertEquals("Horário Educação Infantil/Alfabetização/Matemática", horario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaHorarioComMatematicaMaisAlfabetizacaoMaisArtes() {
        Horario horario = new Matematica(new Alfabetizacao(new Artes(new HorarioEducacaoInfantil())));
        assertEquals("Horário Educação Infantil/Artes/Alfabetização/Matemática", horario.getEstrutura());
    }

}
