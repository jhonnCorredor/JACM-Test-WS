package com.session3.JACM_test_WS.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.session3.JACM_test_WS.Entity.CabinTypes;
import com.session3.JACM_test_WS.IRepository.IBaseRepository;
import com.session3.JACM_test_WS.IRepository.ICabinTypesRepository;
import com.session3.JACM_test_WS.IService.ICabinTypesService;

@Service
public class CabinTypeService extends ABaseService<CabinTypes> implements ICabinTypesService{

	@Autowired
	private ICabinTypesRepository repository;
	
	@Override
	protected IBaseRepository<CabinTypes, Long> getRepository() {
		return repository;
	}

}
