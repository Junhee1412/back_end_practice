package com.ezen.Meow;

import java.util.Optional;

public interface UserRepository {
    /* OAuth */
    Optional<User> findByEmail(String email);

    User save(User user);
}
