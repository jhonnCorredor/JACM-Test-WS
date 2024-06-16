package com.session3.JACM_test_WS.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.session3.JACM_test_WS.Entity.Users;
import com.session3.JACM_test_WS.IRepository.IBaseRepository;
import com.session3.JACM_test_WS.IRepository.IUsersRepository;
import com.session3.JACM_test_WS.IService.IUsersService;

@Service
public class UsersService extends ABaseService<Users> implements IUsersService{

	@Autowired
	private IUsersRepository repository;
	
	@Override
	protected IBaseRepository<Users, Long> getRepository() {
		return repository;
	}

}
