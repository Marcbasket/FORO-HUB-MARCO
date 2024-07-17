package spring.foro_hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.foro_hub.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {

}
