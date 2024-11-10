package edu.icet.repository;

import edu.icet.dto.User;
import edu.icet.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    boolean existsByEmail(String email);
    @Query("SELECT u.password FROM UserEntity u WHERE u.email = ?1")
    String checkePassword(String email);
}
