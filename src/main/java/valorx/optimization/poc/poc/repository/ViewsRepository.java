package valorx.optimization.poc.poc.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import valorx.optimization.poc.poc.dto.ViewDetail;
import valorx.optimization.poc.poc.entity.Views;

@Repository
public interface ViewsRepository extends JpaRepository<Views, Long> {

}
