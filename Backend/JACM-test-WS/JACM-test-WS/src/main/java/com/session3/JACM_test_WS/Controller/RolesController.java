package com.session3.JACM_test_WS.Controller;
import com.session3.JACM_test_WS.Entity.Roles;
import com.session3.JACM_test_WS.IService.IRolesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/roles")
public class RolesController extends ABaseController<Roles,IRolesService>{

	protected RolesController(IRolesService service) {
		super(service, "Roles");
	}

}
