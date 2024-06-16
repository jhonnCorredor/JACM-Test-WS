package com.session3.JACM_test_WS.IService;

import java.util.List;
import com.session3.JACM_test_WS.Dto.Vuelos;
import com.session3.JACM_test_WS.Dto.filtro;
import com.session3.JACM_test_WS.Entity.Schedules;

public interface ISchedulesService extends IBaseService<Schedules>{

	List<Vuelos> filtroVuelos(filtro filtro);
}
