package com.liveodds.persistence;

import com.liveodds.entity.Team;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

public class TeamDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get Team by id
     */
    public Team getById(int id) {
        Session session = sessionFactory.openSession();
        Team team = session.get( Team.class, id );
        session.close();
        return team;
    }

    /**
     * update Team
     * @param team  Team to be inserted or updated
     */
    public void saveOrUpdate(Team team) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(team);
        transaction.commit();
        session.close();
    }

    /**
     * insert Team
     * @param team  Team to be inserted
     */
    public int insert(Team team) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(team);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a Team
     * @param team Team to be deleted
     */
    public void delete(Team team) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(team);
        transaction.commit();
        session.close();
    }


    /** Return a list of all Teams
     *
     * @return All Teams
     */
    public List<Team> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Team> query = builder.createQuery( Team.class );
        Root<Team> root = query.from( Team.class );
        List<Team> teams = session.createQuery( query ).getResultList();

        logger.debug("The list of Teams " + teams);
        session.close();

        return teams;
    }

    /**
     * Get team by property (exact match)
     * sample usage: getByPropertyEqual("lastName", "Curry")
     *
     * @param propertyName entity property to search by
     * @param value value of the property to search for
     * @return list of teams meeting the criteria search
     */
    public List<Team> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for team with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Team> query = builder.createQuery( Team.class );
        Root<Team> root = query.from( Team.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<Team> teams = session.createQuery( query ).getResultList();

        session.close();
        return teams;
    }

    /**
     * Get team by property (like)
     * sample usage: getByPropertyLike("lastName", "C")
     *
     * @param propertyName entity property to search by
     * @param value value of the property to search for
     * @return list of teams meeting the criteria search
     */
    public List<Team> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for team with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Team> query = builder.createQuery( Team.class );
        Root<Team> root = query.from( Team.class );
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<Team> teams = session.createQuery( query ).getResultList();
        session.close();
        return teams;
    }
}
