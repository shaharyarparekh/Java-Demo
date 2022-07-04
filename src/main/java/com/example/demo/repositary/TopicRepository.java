package com.example.demo.repositary;

import com.example.demo.models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends JpaRepository<Topic,Integer> {
}
