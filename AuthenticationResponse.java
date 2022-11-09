package Model;

import java.util.Collection;

import org.springframework.security.oauth2.core.OAuth2AccessToken;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {

	
	private String userId;
	private String accessToken;
	private String refreshToken;
	private long expireAt;
	Collection<String> authorityList;
	
}
