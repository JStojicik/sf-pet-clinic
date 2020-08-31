package jovica.springframework.sfpetclinic.repositories;

import jovica.springframework.sfpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
