package com.session3.JACM_test_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.session3.JACM_test_WS.IService.IAirportsService;
import com.session3.JACM_test_WS.Entity.Airports;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/airports")
public class AirportsController extends ABaseController<Airports, IAirportsService>{

	protected AirportsController(IAirportsService service) {
		super(service, "Airports");
	}

}
