package com.brixton.demoinput.dto.response;

import com.brixton.demoinput.dto.response.request.CategoryRequestDTO;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PetResponseDTO {

    int id;
    String name;
    String birthdate;
    CategoryRequestDTO category;
    String status;
    String createdAt;
    String updatedAt;

}
