package AppConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.telusko.model.Alien;
import com.telusko.model.Computer;
import com.telusko.model.Desktop;
import com.telusko.model.laptop;

@Configuration
@ComponentScan("com.telusko.model")
public class Appconfig {
//	
//	@Bean
//	@Scope("prototype")
//	public Desktop desk()
//	{
//		return new Desktop();
//	}
//
//	@Bean
//	public Alien alien( Computer com) //whether we can prefer the @Qualifier or @Primary one to choose any one object
//	{
//		Alien obj = new Alien();
//		
//		obj.setAge(25);
//		
//		obj.setCom(com);
//		
//		return obj;
//		
//	}
//	
//	@Bean
//	@Primary
//	public laptop lap()
//	{
//		return new laptop();
//	}
//	
}
