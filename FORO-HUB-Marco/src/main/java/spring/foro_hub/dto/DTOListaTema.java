package spring.foro_hub.dto;

import spring.foro_hub.model.Curso;
import spring.foro_hub.model.Tema;

public record DTOListaTema(
        Long id,
        String titulo,
        String mensaje,
        Curso curso
) {

    public DTOListaTema(Tema tema) {
        this(tema.getId(), tema.getTitulo(), tema.getMensaje(), tema.getCurso());
    }

}
