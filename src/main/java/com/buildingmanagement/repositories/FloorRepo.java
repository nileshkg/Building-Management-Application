package com.buildingmanagement.repositories;

import com.buildingmanagement.entities.BuildingComplex;
import com.buildingmanagement.entities.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FloorRepo extends JpaRepository<Floor, Integer> {

    @Query("SELECT f FROM Floor f WHERE f.buildingComplex.buildComplexId = :buildComplexId")
    List<Floor> getAllFloorOfBuild(@Param("buildComplexId") Integer buildComplexId);
}
