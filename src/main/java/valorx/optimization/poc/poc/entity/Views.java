package valorx.optimization.poc.poc.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "views")
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

    @Column(name = "query")
//    @Type(value = "jsonb")
    public String query;

    @Column(name = "fields")
//    @Type(value = "jsonb")
    public String fields;

    @Column(name = "display_option")
//    @Type(value = "jsonb")
    public String displayOption;

    @Column(name = "environment_id")
    public long environmentId;

    @Column(name = "owner_id")
    public long ownerId;

    @Column(name = "insert_ts")
    public LocalDateTime insertTimestamp;

    @Column(name = "modified_ts")
    public LocalDateTime modifiedTimestamp;

    @Column(name = "report_metadata")
//    @Type(value = "jsonb")
    public String reportMetadata;

    @Column(name = "report_id")
    public String reportId;

    @Column(name = "last_accessed_time")
    public LocalDateTime lastAccessedTime;
}
