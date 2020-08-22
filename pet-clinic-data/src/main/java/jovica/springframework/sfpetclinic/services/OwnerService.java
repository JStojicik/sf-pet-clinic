package jovica.springframework.sfpetclinic.services;

import jovica.springframework.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
