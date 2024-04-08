package valorx.optimization.poc.poc.dto;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;
import java.util.Map;

@Builder
@AllArgsConstructor
public class ViewDetail {

    public String description;

    @Type(JsonType.class)
    public Map<String, Object> displayOption;

    public long environmentId;

    @Type(JsonType.class)
    public Map<String, Object> fields;

    public LocalDateTime insertTimestamp;

    public LocalDateTime lastAccessedTime;

    public LocalDateTime modifiedTimestamp;

    public String name;

    public String objectId;

    public long ownerId;

    @Type(JsonType.class)
    public Map<String, Object> query;

    public String reportId;

    @Type(JsonType.class)
    public Map<String, Object> reportMetaData;

//    ----------------------------------------

    public String email;

    public String fullName;

    public LocalDateTime buInsertTimestamp;

    public int invitationStatus;

    public long invitedBy;

    public boolean isDeleted;

    public long licenseId;

    public LocalDateTime buModifiedTimestamp;

    @Type(JsonType.class)
    public Map<String, Object> preferences;

    public String salesforceUserId;

    public String shortedUserName;

    public int userType;
}
