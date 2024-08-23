package com.velocity.repository;

<<<<<<< HEAD
public interface userRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.User;

@Repository
public interface userRepository extends JpaRepository<User,Integer> {
>>>>>>> 6896fd5b70d5d64fece793af8363156422798d26

}
