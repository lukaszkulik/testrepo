package pworks.household.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SynchronizationController {
	
	@RequestMapping("/sync")
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	public void synchronize(@RequestParam(required=false) Synchronization synchronization) {
		// implement it!
	}

}
