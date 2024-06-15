package com.session3.JACM_test_WS.Controller;
import com.session3.JACM_test_WS.Entity.Users;
import com.session3.JACM_test_WS.IService.IUsersService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/users")
public class UsersController extends ABaseController<Users,IUsersService>{

	protected UsersController(IUsersService service) {
		super(service, "Users");
	}

}
