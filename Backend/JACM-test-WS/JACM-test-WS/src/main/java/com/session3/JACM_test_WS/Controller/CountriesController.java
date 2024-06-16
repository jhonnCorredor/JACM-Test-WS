package com.session3.JACM_test_WS.Controller;
import com.session3.JACM_test_WS.Entity.Countries;
import com.session3.JACM_test_WS.IService.ICountriesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/countries")
public class CountriesController extends ABaseController<Countries,ICountriesService>{

	protected CountriesController(ICountriesService service) {
		super(service, "Countries");
	}

}
