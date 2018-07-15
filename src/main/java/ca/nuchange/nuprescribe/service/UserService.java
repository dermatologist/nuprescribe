package ca.nuchange.nuprescribe.service;

import ca.nuchange.nuprescribe.bean.User;
import ca.nuchange.nuprescribe.generic.GenericService;

public interface UserService extends GenericService<User> {

    boolean authenticate(String email, String password);

    User findByEmail(String email);

}