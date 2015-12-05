package ext.billopen.start.db.repo;

import org.springframework.data.repository.CrudRepository;

import ext.billopen.start.db.entity.StartUpDemo;

/**
* @author  Bill_Ho@foxmail.com
* @version 2015年12月5日 下午3:51:43
* 
*/
public interface StartUpDemoRepo extends CrudRepository<StartUpDemo, String>{
	public StartUpDemo findById(String id);
	
}
