package com.kosign.structure_config.payload.auth;

import lombok.Data;

@Data
public class ResetPasswordRequest {

    private String newPassword;
    private String confirmNewPassword;
}
