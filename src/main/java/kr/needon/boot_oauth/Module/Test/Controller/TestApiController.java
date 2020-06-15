package kr.needon.boot_oauth.Module.Test.Controller;

import kr.needon.boot_oauth.Exception.ResourceNotFoundException;
import kr.needon.boot_oauth.Module.User.Entity.User;
import kr.needon.boot_oauth.Module.User.Repository.UserRepository;
import kr.needon.boot_oauth.Module.User.Security.CurrentUser;
import kr.needon.boot_oauth.Module.User.Security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/user/me")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
		return userRepository.findById(userPrincipal.getId())
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
	}
	
	@GetMapping("/api/test/user")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public String UserTest() {
		return "Hello User";
	}

	
	@GetMapping("/api/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String Admin() {

		return "Hello Admin";
	}
}