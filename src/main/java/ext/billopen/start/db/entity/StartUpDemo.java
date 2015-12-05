package ext.billopen.start.db.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
* @author  Bill_Ho@foxmail.com
* @version 2015年12月5日 下午3:39:42
* 
*/
@Entity
@Data
public class StartUpDemo {
	@GenericGenerator(name = "generator", strategy = "uuid.hex")  
    @Id  
    @GeneratedValue(generator = "generator")
	private String id;
	private String content;
}
