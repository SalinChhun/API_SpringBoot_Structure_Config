package com.kosign.structure_config.service;

import com.kosign.structure_config.payload.pincode.PinCodeRequest;

public interface SendMailOTPService {

    public void sendMailOTP(PinCodeRequest pinCodeRequest);
}
