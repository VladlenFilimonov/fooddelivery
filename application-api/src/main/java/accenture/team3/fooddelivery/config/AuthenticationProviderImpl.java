package accenture.team3.fooddelivery.config;

import accenture.team3.fooddelivery.dao.UserDao;
import accenture.team3.fooddelivery.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationProviderImpl implements AuthenticationProvider {

    private UserDao userDao;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public AuthenticationProviderImpl(UserDao userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        User user = userDao.findByLogin(authentication.getName());
        if (user == null) {
            throw new BadCredentialsException(authentication.getName());
        }
        if (!passwordEncoder.matches(authentication.getCredentials().toString(), user.getPassword())) {
            throw new BadCredentialsException("Invalid password");
        }
        return new UsernamePasswordAuthenticationToken(user.getLogin(), "", user.getRoles());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
