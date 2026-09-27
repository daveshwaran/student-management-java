package com.example.Employee_Management.repository;

import com.example.Employee_Management.models.EnrollmentEntity;
import com.example.Employee_Management.models.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity,Long> {
    public List<EnrollmentEntity> findByStudentId(Long studentId);
    public List<EnrollmentEntity> findByCourseId(Long courseId);
}
// using native query but here i need to create the table in mysql
//public interface EnrollmentRepository
//        extends JpaRepository<EnrollmentEntity, Long> {
//
//    @Query(
//            value = "SELECT * FROM enrollment WHERE student_id = :studentId",
//            nativeQuery = true
//    )
//    List<EnrollmentEntity> findByStudentId(
//            @Param("studentId") Long studentId
//    );
//
//    @Query(
//            value = "SELECT * FROM enrollment WHERE course_id = :courseId",
//            nativeQuery = true
//    )
//    List<EnrollmentEntity> findByCourseId(
//            @Param("courseId") Long courseId
//    );
//}
