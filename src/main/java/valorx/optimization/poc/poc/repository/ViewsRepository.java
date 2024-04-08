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

    @Query(value = "SELECT new valorx.optimization.poc.poc.dto.ViewDetail(V.description, V.displayOption, V.environmentId, " +
            "V.fields, V.insertTimestamp, V.lastAccessedTime, V.modifiedTimestamp, V.name, V.objectId, V.ownerId, V.query, " +
            "V.reportId, V.reportMetadata, BU.email, BU.fullName, BU.insertTimestamp, BU.invitationStatus, BU.invitedBy, " +
            "BU.isDeleted, BU.licenseId, BU.modifiedTimestamp, BU.preferences, BU.salesforceUserId, BU.shortedUsername, " +
            "BU.userType) FROM Views V " +
            "LEFT JOIN BusinessUsers BU ON V.ownerId = BU.id " +
            "WHERE V.environmentId = :environment_id AND V.id = :view_id AND V.ownerId = :owner_id")
    Page<ViewDetail> getViewDetails(@Param("environment_id") int environmentId, @Param("owner_id") int ownerId, @Param("view_id") int viewId, Pageable pageable);
}
