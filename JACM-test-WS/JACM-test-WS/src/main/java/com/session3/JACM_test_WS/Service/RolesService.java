package com.session3.JACM_test_WS.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.session3.JACM_test_WS.Entity.Roles;
import com.session3.JACM_test_WS.IRepository.IBaseRepository;
import com.session3.JACM_test_WS.IRepository.IRolesRepository;
import com.session3.JACM_test_WS.IService.IRolesService;

@Service
public class RolesService extends ABaseService<Roles> implements IRolesService{

	@Autowired
	private IRolesRepository repository;
	
	@Override
	protected IBaseRepository<Roles, Long> getRepository() {
		return repository;
	}

}
