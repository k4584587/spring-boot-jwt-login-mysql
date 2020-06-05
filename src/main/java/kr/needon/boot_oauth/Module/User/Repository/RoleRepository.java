package kr.needon.boot_oauth.Module.User.Repository;

import kr.needon.boot_oauth.Module.User.Entity.Role;
import kr.needon.boot_oauth.Module.User.Entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}