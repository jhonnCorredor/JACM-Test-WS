package com.session3.JACM_test_WS.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.session3.JACM_test_WS.Entity.Countries;
import com.session3.JACM_test_WS.IRepository.IBaseRepository;
import com.session3.JACM_test_WS.IRepository.ICountriesRepository;
import com.session3.JACM_test_WS.IService.ICountriesService;

@Service
public class CountriesService extends ABaseService<Countries> implements ICountriesService{

	@Autowired
	private ICountriesRepository repository;
	
	@Override
	protected IBaseRepository<Countries, Long> getRepository() {
		return repository;
	}

}
