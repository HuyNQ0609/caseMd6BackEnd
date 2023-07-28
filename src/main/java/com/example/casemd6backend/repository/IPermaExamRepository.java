package com.example.casemd6backend.repository;

import com.casestudymodule6.model.record.PermaExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPermaExamRepository extends JpaRepository<PermaExam,Long> {
}
