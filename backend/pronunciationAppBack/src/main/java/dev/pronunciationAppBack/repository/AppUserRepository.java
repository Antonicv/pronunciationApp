package dev.pronunciationAppBack.repository;

import dev.pronunciationAppBack.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, String> {
    
    List<AppUser> findByIsActiveTrue();

    AppUser findByEmail(String email);

    List<AppUser> findByAgeGreaterThan(int age);
}
