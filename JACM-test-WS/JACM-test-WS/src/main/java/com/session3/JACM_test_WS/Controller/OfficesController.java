package com.session3.JACM_test_WS.Controller;
import com.session3.JACM_test_WS.Entity.Offices;
import com.session3.JACM_test_WS.IService.IOfficeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/offices")
public class OfficesController extends ABaseController<Offices,IOfficeService>{

	protected OfficesController(IOfficeService service) {
		super(service, "Offices");
		// TODO Auto-generated constructor stub
	}

}
