package ru.neoflex.practice;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.practice.controller.CalcController;

import java.util.List;

@Repository
@Hidden
public interface CalcRepository extends CrudRepository<CalcData, Long> {
    List<CalcData> findAllByOrderByIdDesc();

}
