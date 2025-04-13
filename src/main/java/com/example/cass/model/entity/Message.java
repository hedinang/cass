package com.example.cass.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant;

@Table("message")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    @PrimaryKeyColumn(name = "message_id", type = PrimaryKeyType.PARTITIONED)
    private String messageId;

    @PrimaryKeyColumn(name = "timestamp", ordinal = 0, ordering = Ordering.DESCENDING)
    private Instant timestamp;

    @Column("content")
    private String content;
}