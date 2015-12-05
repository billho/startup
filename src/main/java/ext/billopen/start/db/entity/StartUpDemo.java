package ext.billopen.start.db.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
* @author  Bill_Ho@foxmail.com
* @version 2015年12月5日 下午3:39:42
* 
*/
@Entity
public class StartUpDemo {
	@GenericGenerator(name = "generator", strategy = "uuid.hex")  
    @Id  
    @GeneratedValue(generator = "generator")
	private String id;
	
	private String content;
	
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id= id;
	}
	
	public String getContent(){
		return content;
	}
	public void setContent(String content){
		this.content= content;
	}
}
