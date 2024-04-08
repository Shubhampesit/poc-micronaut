package valorx.optimization.poc.poc.entity;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;
import java.util.Map;

@Entity
@Table(name = "views")
@Data
public class Views {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long id;

    @Column(name = "name")
    public String name;

    @Column(name = "object_id")
    public String objectId;

    @Column(name = "description")
    public String description;

    @Column(name = "query", columnDefinition = "jsonb")
    @Type(JsonType.class)
    public Map<String, Object> query;

    @Column(name = "fields", columnDefinition = "jsonb")
    @Type(JsonType.class)
    public Map<String, Object> fields;

    @Column(name = "display_option", columnDefinition = "jsonb")
    @Type(JsonType.class)
    public Map<String, Object> displayOption;

    @Column(name = "environment_id")
    public long environmentId;

    @Column(name = "owner_id")
    public long ownerId;

    @Column(name = "insert_ts")
    public LocalDateTime insertTimestamp;

    @Column(name = "modified_ts")
    public LocalDateTime modifiedTimestamp;

    @Column(name = "report_metadata", columnDefinition = "jsonb")
    @Type(JsonType.class)
    public Map<String, Object> reportMetadata;

    @Column(name = "report_id")
    public String reportId;

    @Column(name = "last_accessed_time")
    public LocalDateTime lastAccessedTime;
}
