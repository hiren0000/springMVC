package springmvc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.Model.User;

@Repository
public class UserDao 
{
	@Autowired
	private HibernateTemplate hbt;
	
	public void setHbt(HibernateTemplate hbt) {
		this.hbt = hbt;
	}

	@Transactional
	public int saveUser(User user) 
	{
		 int id = (Integer)this.hbt.save(user);
		 return id;
	}
	
	

}
