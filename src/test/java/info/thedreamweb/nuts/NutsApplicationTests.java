package info.thedreamweb.nuts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class NutsApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	void shouldNotGetUserWhenNotAuthenticated() {
		ResponseEntity<String> res = restTemplate.getForEntity("/user",
				String.class);
		assertThat(res.getStatusCode()).isEqualTo(HttpStatus.FORBIDDEN);
	}

	@Test
	void shouldGetLoginAlways() {
		ResponseEntity<String> res = restTemplate.getForEntity("/login",
				String.class);
		assertThat(res.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

}
