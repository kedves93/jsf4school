package com.school.jsf;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;


@ApplicationScoped
public class UserServiceImpl implements UserService {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("production");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();

    @Override
    public User getUser(String username) {
    	User user;
    	
    	try {
    		user = em.createQuery("SELECT u FROM User u WHERE u.username = :name", User.class)
    				 .setParameter("name", username)
    				 .getSingleResult();
    	} catch(Exception e) {
    		user = null;
    	}
    			      
        return user;
    }
    
    @Override
    public void saveUser(User user) {
    	tx.begin();
    	em.persist(user);
    	tx.commit();
    }
}
