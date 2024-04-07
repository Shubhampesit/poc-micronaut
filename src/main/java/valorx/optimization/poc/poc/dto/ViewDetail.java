package valorx.optimization.poc.poc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
public class ViewDetail {

    public String description;

    public String displayOption;

    public long environmentId;

    public String fields;

    public LocalDateTime insertTimestamp;

    public LocalDateTime lastAccessedTime;

    public LocalDateTime modifiedTimestamp;

    public String name;

    public String objectId;

    public long ownerId;

    public String query;

    public String reportId;

    public String reportMetaData;

//    ----------------------------------------

    public String email;

    public String fullName;

    public LocalDateTime buInsertTimestamp;

    public int invitationStatus;

    public long invitedBy;

    public boolean isDeleted;

    public long licenseId;

    public LocalDateTime buModifiedTimestamp;

    public String preferences;

    public String salesforceUserId;

    public String shortedUserName;

    public int userType;
}
