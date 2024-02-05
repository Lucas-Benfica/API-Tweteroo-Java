package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {
    @NotBlank(message = "Avatar is required")
    private String avatar;

    @NotBlank(message = "Username is required")
    @Size(max = 100, message = "Maximum size is 100")
    private String username;
}
