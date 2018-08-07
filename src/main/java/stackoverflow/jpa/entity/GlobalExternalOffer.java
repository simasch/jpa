package stackoverflow.jpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@DiscriminatorValue("GLOBAL")
public class GlobalExternalOffer extends ExternalOffer {

    @ManyToMany(mappedBy = "globalExternalOffers", fetch = FetchType.EAGER)
    private List<K> kRef;


    public List<K> getkRef() {
        return kRef;
    }

    public void setkRef(List<K> kRef) {
        this.kRef = kRef;
    }
}