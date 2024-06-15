package com.session3.JACM_test_WS.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.session3.JACM_test_WS.Entity.Tickets;
import com.session3.JACM_test_WS.IRepository.IBaseRepository;
import com.session3.JACM_test_WS.IRepository.ITicketsRepository;
import com.session3.JACM_test_WS.IService.ITicketsService;

@Service
public class TicketsService extends ABaseService<Tickets> implements ITicketsService{

	@Autowired
	private ITicketsRepository repository;
	
	@Override
	protected IBaseRepository<Tickets, Long> getRepository() {
		return repository;
	}

}
