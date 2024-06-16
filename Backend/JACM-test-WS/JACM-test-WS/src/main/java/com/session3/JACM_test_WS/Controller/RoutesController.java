package com.session3.JACM_test_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.session3.JACM_test_WS.Entity.Routes;
import com.session3.JACM_test_WS.IService.IRoutesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/routes")
public class RoutesController extends ABaseController<Routes,IRoutesService>{

	protected RoutesController(IRoutesService service) {
		super(service, "Routes");
	}

}
