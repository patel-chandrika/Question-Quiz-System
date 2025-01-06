package com.quizservice.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.quizservice.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
