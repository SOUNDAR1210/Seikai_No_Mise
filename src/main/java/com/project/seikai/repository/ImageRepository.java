package com.project.seikai.repository;

import com.project.seikai.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image,Long> {

    List<Image> findByProductId(Long id);
}
