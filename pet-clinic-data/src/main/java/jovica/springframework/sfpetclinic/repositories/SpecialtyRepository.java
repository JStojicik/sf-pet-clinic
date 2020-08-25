package jovica.springframework.sfpetclinic.repositories;

import jovica.springframework.sfpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty,Long> {
}
