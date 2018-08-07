package stackoverflow.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import stackoverflow.jpa.entity.GlobalExternalOffer;
import stackoverflow.jpa.entity.K;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class JpaApplicationTests {

    @PersistenceContext
    private EntityManager em;

    @Test
    public void contextLoads() {
        K k = new K();

        em.persist(k);

        GlobalExternalOffer globalExternalOffer = new GlobalExternalOffer();

        em.persist(globalExternalOffer);

    }

}
