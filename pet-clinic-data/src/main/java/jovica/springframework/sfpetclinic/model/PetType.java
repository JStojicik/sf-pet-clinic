package jovica.springframework.sfpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
