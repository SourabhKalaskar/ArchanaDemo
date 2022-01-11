package in.ashokit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	
	Logger logger=LoggerFactory.getLogger(UserService.class);
	
	public void save()
	{
		logger.debug("UserService save method execurion started");

//		business logic
		
		logger.info("UserService save method execurion completed");
		
	}
	
	
}
