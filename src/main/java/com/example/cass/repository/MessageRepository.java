package com.example.cass.repository;

import com.example.cass.model.entity.Message;
import com.example.cass.model.entity.id_class.MessageKey;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface MessageRepository extends CassandraRepository<Message, MessageKey> {
}
