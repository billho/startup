package ext.billopen.start.db.persistent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ext.billopen.start.db.entity.StartUpDemo;
import ext.billopen.start.db.repo.StartUpDemoRepo;

/**
* @author  Bill_Ho@foxmail.com
* @version 2015年12月5日 下午3:52:35
* 
*/
@Component
public class StartUpDemoPersistent {
	@Autowired
	private StartUpDemoRepo repo;
	
	public StartUpDemo findById(String id){
		return repo.findById(id);
	}
	public StartUpDemo save(StartUpDemo startUpDemo){
		return repo.save(startUpDemo);
	}
}
