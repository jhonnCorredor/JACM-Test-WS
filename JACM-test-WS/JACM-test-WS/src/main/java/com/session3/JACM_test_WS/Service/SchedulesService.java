package com.session3.JACM_test_WS.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.session3.JACM_test_WS.Entity.Schedules;
import com.session3.JACM_test_WS.IRepository.IBaseRepository;
import com.session3.JACM_test_WS.IRepository.ISchedulesRepository;
import com.session3.JACM_test_WS.IService.ISchedulesService;

@Service
public class SchedulesService extends ABaseService<Schedules> implements ISchedulesService{

	@Autowired
	private ISchedulesRepository repository;
	
	@Override
	protected IBaseRepository<Schedules, Long> getRepository() {
		return repository;
	}

	
}
