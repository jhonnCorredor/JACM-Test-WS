package com.session3.JACM_test_WS.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.session3.JACM_test_WS.Entity.Airports;
import com.session3.JACM_test_WS.IRepository.IAirportsRepository;
import com.session3.JACM_test_WS.IRepository.IBaseRepository;
import com.session3.JACM_test_WS.IService.IAirportsService;

@Service
public class AirportsService extends ABaseService<Airports> implements IAirportsService{

	@Autowired
	private IAirportsRepository repository;
	
	@Override
	protected IBaseRepository<Airports, Long> getRepository() {
		return repository;
	}

}
