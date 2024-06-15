package com.session3.JACM_test_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.session3.JACM_test_WS.Entity.CabinTypes;
import com.session3.JACM_test_WS.IService.ICabinTypesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/cabinTypes")
public class CabinTypesController extends ABaseController<CabinTypes,ICabinTypesService>{

	protected CabinTypesController(ICabinTypesService service) {
		super(service, "CabinTypes");
	}

}
