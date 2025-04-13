package com.example.cass.model.entity.id_class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyClass
public class MessageKey implements Serializable {

    @PrimaryKeyColumn(name = "message_id", type = PrimaryKeyType.PARTITIONED)
    private String messageId;

    @PrimaryKeyColumn(name = "timestamp", ordinal = 0, ordering = Ordering.DESCENDING)
    private Instant timestamp;
}