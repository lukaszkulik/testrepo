package pworks.household.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SynchronizationController {
	
	@RequestMapping("/sync")
	public SynchronizationResult synchronize(@RequestParam Synchronization synchronization) {
		SynchronizationResult result = new SynchronizationResult();
		
		// TODO implement it!
		
		return result;
	}

}
