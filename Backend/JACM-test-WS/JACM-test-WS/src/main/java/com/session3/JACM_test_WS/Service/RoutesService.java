package com.session3.JACM_test_WS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.session3.JACM_test_WS.Entity.Routes;
import com.session3.JACM_test_WS.IRepository.IBaseRepository;
import com.session3.JACM_test_WS.IRepository.IRoutesRepository;
import com.session3.JACM_test_WS.IService.IRoutesService;

@Service
public class RoutesService extends ABaseService<Routes> implements IRoutesService{

	@Autowired
	private IRoutesRepository repository;
	
	@Override
	protected IBaseRepository<Routes, Long> getRepository() {
		return repository;
	}

}
