package dao;

import pojos.User;
import static utils.HibernateUtils.getFactory;

import java.io.Serializable;

import org.hibernate.*;

public class UserDaoImpl implements IUserDao {

	

	@Override
	public User getUserDetails(int userId) {
		User user = null;
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
			user = session.get(User.class, userId);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return user;
	}

	@Override
	public String addData(User user) {
		Session session=getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		String msg;
		try {
		Serializable id=session.save(user);
			tx.commit();
			msg="Success:-"+id;
		}catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;	
		}
		return msg;
	}

	@Override
	public String deleteUserDetails(int id) {
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
		User u=session.get(User.class, id);
		session.delete(u);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return "Deleted";
	}


	
}
