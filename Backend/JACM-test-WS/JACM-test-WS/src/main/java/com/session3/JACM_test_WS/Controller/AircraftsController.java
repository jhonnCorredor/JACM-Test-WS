package com.session3.JACM_test_WS.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.session3.JACM_test_WS.Entity.Aircrafts;
import com.session3.JACM_test_WS.IService.IAircraftService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/aircraft")
public class AircraftsController extends ABaseController<Aircrafts,IAircraftService> {

	protected AircraftsController(IAircraftService service) {
		super(service, "Aircrafts");
	}

}
