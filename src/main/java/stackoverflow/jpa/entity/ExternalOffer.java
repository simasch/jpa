package stackoverflow.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "external_offer")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "offer_type", discriminatorType = DiscriminatorType.STRING)
public abstract class ExternalOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}