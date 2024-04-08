package valorx.optimization.poc.poc.entity;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;
import java.util.Map;

@Entity
@Table(name = "business_users")
public class BusinessUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long id;

   @OneToOne(mappedBy = "ownerId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   public Views views;

    @Column(name = "salesforce_user_id")
    public String salesforceUserId;

    @Column(name = "shorted_username")
    public String shortedUsername;

    @Column(name = "preferences", columnDefinition = "jsonb")
    @Type(JsonType.class)
    public Map<String, Object> preferences;

    @Column(name = "license_id")
    public long licenseId;

    @Column(name = "is_deleted")
    public boolean isDeleted;

    @Column(name = "insert_ts")
    public LocalDateTime insertTimestamp;

    @Column(name = "modified_ts")
    public LocalDateTime modifiedTimestamp;

    @Column(name = "email")
    public String email;

    @Column(name = "full_name")
    public String fullName;

    @Column(name = "user_type")
    public int userType;

    @Column(name = "invitation_status")
    public int invitationStatus;

    @Column(name = "invited_by")
    public long invitedBy;
}
