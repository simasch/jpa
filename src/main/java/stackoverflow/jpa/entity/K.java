package stackoverflow.jpa.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "k")
public class K {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "K2GlobalOffer",
            joinColumns = @JoinColumn(
                    name = "k_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "global_offer_id", referencedColumnName = "id"))
    private List<GlobalExternalOffer> globalExternalOffers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<GlobalExternalOffer> getGlobalExternalOffers() {
        return globalExternalOffers;
    }

    public void setGlobalExternalOffers(List<GlobalExternalOffer> globalExternalOffers) {
        this.globalExternalOffers = globalExternalOffers;
    }
}