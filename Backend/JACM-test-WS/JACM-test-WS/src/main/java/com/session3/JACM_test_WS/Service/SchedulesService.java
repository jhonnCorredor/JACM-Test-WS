package com.session3.JACM_test_WS.Service;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.session3.JACM_test_WS.Dto.Vuelos;
import com.session3.JACM_test_WS.Dto.filtro;
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

	@Override
	public List<Vuelos> filtroVuelos(filtro filtro) {
		String origen=filtro.getOrigen();
		String destino=filtro.getDestino();
		LocalDate fecha1=filtro.getFecha1();
		LocalDate fecha2=filtro.getFecha2();
		
		return repository.filtroVuelos(origen, destino, fecha1, fecha2);
	}

	
}
