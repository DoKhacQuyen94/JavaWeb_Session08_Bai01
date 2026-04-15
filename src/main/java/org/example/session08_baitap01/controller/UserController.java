package org.example.session08_baitap01.controller;

import jakarta.validation.Valid;
import org.example.session08_baitap01.dto.AddressDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/address")
public class UserController {
    @GetMapping("/add")
    public String home(){
        return "address";
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateAddress(@Valid AddressDTO addressDto) {
        // Nếu dữ liệu không hợp lệ, Spring sẽ tự động ném ra MethodArgumentNotValidException
        // và trả về lỗi 400 Bad Request kèm thông báo lỗi cụ thể.
        return ResponseEntity.ok("Cập nhật địa chỉ thành công!");
    }
}