package jovica.springframework.sfpetclinic.services;

import jovica.springframework.sfpetclinic.model.Visit;
import org.springframework.stereotype.Service;

@Service
public interface VisitService extends CrudService<Visit, Long> {
}
