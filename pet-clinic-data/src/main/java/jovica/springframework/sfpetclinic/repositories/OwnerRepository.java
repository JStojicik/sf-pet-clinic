package jovica.springframework.sfpetclinic.repositories;

import jovica.springframework.sfpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
