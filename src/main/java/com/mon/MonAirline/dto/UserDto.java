package com.mon.MonAirline.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mon.MonAirline.enums.AuthMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
public class UserDto {
    private Long id;

    private String name;

    private String email;

    private String phoneNumber;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private boolean emailVerified;

    private AuthMethod authProvider;

    private String providerId;

    private List<RoleDto> roles;

    private boolean active;
}
