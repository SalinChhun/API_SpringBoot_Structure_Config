package com.kosign.structure_config.service;

import com.kosign.structure_config.payload.pincode.PinCodeRequest;

public interface OTPService {
    PinCodeRequest generatePinCode(String email);

    String confirmPinCode(String email, String pinCode);

}
