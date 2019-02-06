/**
 * 
 */
package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kunal.lawand
 *
 */

@RestController
public class TestController {

	@RequestMapping(value = "/add/{n1}/{n2}", headers = "Accept=application/json", method = RequestMethod.GET)
	public ResponseEntity<Integer> add(@PathVariable(name = "n1") int n1, @PathVariable(name = "n2") int n2) {
		return new ResponseEntity<Integer>(n1 + n2, HttpStatus.OK);
	}

}
