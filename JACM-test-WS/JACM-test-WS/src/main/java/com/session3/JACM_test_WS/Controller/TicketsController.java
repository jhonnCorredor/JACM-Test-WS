package com.session3.JACM_test_WS.Controller;
import com.session3.JACM_test_WS.Entity.Tickets;
import com.session3.JACM_test_WS.IService.ITicketsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/tickets")
public class TicketsController extends ABaseController<Tickets,ITicketsService>{

	protected TicketsController(ITicketsService service) {
		super(service, "Tickets");
	}

}
