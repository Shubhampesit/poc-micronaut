package valorx.optimization.poc.poc.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Table(name = "business_users")
public class BusinessUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long id;

    @Column(name = "salesforce_user_id")
    public String salesforceUserId;

    @Column(name = "shorted_username")
    public String shortedUserName;

    @Column(name = "preferences")
//    @Type(value = "jsonb")
    public String preferences;

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
