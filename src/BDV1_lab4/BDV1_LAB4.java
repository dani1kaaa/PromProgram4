package edk6_lab4;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;

public class EDK6_LAB4 {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();

        CriteriaQuery<Classifications> criteriaClassifications = cb.createQuery(Classifications.class);
        Root<Classifications> rootClassifications = criteriaClassifications.from(Classifications.class);
        //criteriaUserRole.select(rootUserRole);
        criteriaClassifications.select(rootClassifications).where(cb.like(rootClassifications.get("squad"), "%redat%"));

        CriteriaQuery<Animals> criteriaAnimals = cb.createQuery(Animals.class);
        Root<Animals> rootAnimals = criteriaAnimals.from(Animals.class);
        Predicate[] predicates = new Predicate[2];
        predicates[0] = cb.like(rootAnimals.get("temperatyre"), "%-100%");
        predicates[1] = cb.like(rootAnimals.get("weatherNight"), "%snow%");
        criteriaAnimals.select(rootAnimals).where(predicates);

        Classifications classification1 = new Classifications();
        classification1.setAnimal_class("Pavlodar");
        classification1.setFamily("Pavlodar Region");
        classification1.setSquad("sunny");
        session.save(classification1);



        org.hibernate.Transaction tr = session.beginTransaction();
        session.delete(classification1);
//        session.delete(userRole2);
        tr.commit();

        Animals animal = new Animals();
        animal.setTemperatyre("-100");
        animal.setWeatherNight("snow");
        animal.setClassifications(new Classifications("Pavlodar", "Pavlodar Regiony", "snow"));
        session.save(animal);

        animal = (Animals) session.get(Animals.class, animal.getId());
        session.save(animal);

        List<Animals> resultsAnimals = session.createQuery(criteriaAnimals).getResultList();
        resultsAnimals.forEach((item) -> {
            System.out.println(item);
        });

        List<Classifications> resultsClassifications = session.createQuery(criteriaClassifications).getResultList();
        resultsClassifications.forEach((item) -> {
            System.out.println(item);
        });

        session.close();

        System.exit(0);
    }

}
