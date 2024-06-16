package com.session3.JACM_test_WS.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.session3.JACM_test_WS.Dto.Vuelos;
import com.session3.JACM_test_WS.Dto.filtro;
import com.session3.JACM_test_WS.Dto.ApiResponseDto;
import com.session3.JACM_test_WS.Entity.Schedules;
import com.session3.JACM_test_WS.IService.ISchedulesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/schedules")
public class SchedulesController extends ABaseController<Schedules,ISchedulesService>{

	protected SchedulesController(ISchedulesService service) {
		super(service, "Schedules");
	}

	@PostMapping("/vuelos")
	public ResponseEntity<ApiResponseDto<List<Vuelos>>> vuelos(@RequestBody filtro filtro){
		try {
			return ResponseEntity.ok(new ApiResponseDto<List<Vuelos>>("Datos obtenidos",service.filtroVuelos(filtro),true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<List<Vuelos>>("Error en la consulta",null,false));
		}
	}
}
