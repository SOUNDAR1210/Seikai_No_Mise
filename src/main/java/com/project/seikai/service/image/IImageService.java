package com.project.seikai.service.image;

import com.project.seikai.dto.ImageDto;
import com.project.seikai.model.Image;
import com.project.seikai.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {

    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);


}
