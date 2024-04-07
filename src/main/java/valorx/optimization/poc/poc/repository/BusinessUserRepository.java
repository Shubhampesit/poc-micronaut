package valorx.optimization.poc.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import valorx.optimization.poc.poc.entity.BusinessUsers;

@Repository
public interface BusinessUserRepository extends JpaRepository<BusinessUsers, Long> {
}
