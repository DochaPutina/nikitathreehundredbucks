package com.artemchik.nikitathreehundredbucks.repos;

import com.artemchik.nikitathreehundredbucks.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {
    List<Message> findByTag(String tag);

}
