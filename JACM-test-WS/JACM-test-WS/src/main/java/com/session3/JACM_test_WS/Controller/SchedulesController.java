package com.session3.JACM_test_WS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.session3.JACM_test_WS.Entity.Schedules;
import com.session3.JACM_test_WS.IService.ISchedulesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/schedules")
public class SchedulesController extends ABaseController<Schedules,ISchedulesService>{

	protected SchedulesController(ISchedulesService service) {
		super(service, "Schedules");
	}

}
