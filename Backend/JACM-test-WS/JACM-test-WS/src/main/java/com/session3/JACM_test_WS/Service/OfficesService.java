package com.session3.JACM_test_WS.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.session3.JACM_test_WS.Entity.Offices;
import com.session3.JACM_test_WS.IRepository.IBaseRepository;
import com.session3.JACM_test_WS.IRepository.IOfficesRepository;
import com.session3.JACM_test_WS.IService.IOfficeService;

@Service
public class OfficesService extends ABaseService<Offices> implements IOfficeService{

	@Autowired
	private IOfficesRepository repository;
	
	@Override
	protected IBaseRepository<Offices, Long> getRepository() {
		return repository;
	}

}
