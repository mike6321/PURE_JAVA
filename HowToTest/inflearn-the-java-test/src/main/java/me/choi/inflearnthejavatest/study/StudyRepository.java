package me.choi.inflearnthejavatest.study;

import me.choi.inflearnthejavatest.Study;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepository extends JpaRepository<Study, Long> {

}
