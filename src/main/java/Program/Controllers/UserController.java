package Program.Controllers;

import Program.Services.UserService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import Program.Entities.User;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {

		return ResponseEntity.ok().body(this.userService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<User>> findById(@PathVariable("id") Long id) {
		return ResponseEntity.ok().body(this.userService.findById(id));
	}
}