package jovica.springframework.sfpetclinic.repositories;

import jovica.springframework.sfpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
