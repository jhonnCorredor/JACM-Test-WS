package com.session3.JACM_test_WS.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.session3.JACM_test_WS.Entity.Aircrafts;
import com.session3.JACM_test_WS.IRepository.IAircraftRepository;
import com.session3.JACM_test_WS.IRepository.IBaseRepository;
import com.session3.JACM_test_WS.IService.IAircraftService;

@Service
public class AircraftService extends ABaseService<Aircrafts> implements IAircraftService{

	@Autowired
	private IAircraftRepository repository;
	
	@Override
	protected IBaseRepository<Aircrafts, Long> getRepository() {
		return repository;
	}

}
