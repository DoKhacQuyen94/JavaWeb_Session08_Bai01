package org.example.session08_baitap01.dto;

import jakarta.validation.constraints.NotBlank;

public class AddressDTO {
    // @NotBlank: Không null, độ dài > 0 và không chỉ chứa khoảng trắng
    @NotBlank(message = "Tên người nhận không được để trống hoặc chỉ chứa khoảng trắng")
    private String receiverName;

    @NotBlank(message = "Địa chỉ chi tiết không được thiếu")
    private String detailedAddress;

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }
}