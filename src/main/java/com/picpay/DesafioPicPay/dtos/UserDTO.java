package com.picpay.DesafioPicPay.dtos;

import com.picpay.DesafioPicPay.entities.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, UserType type, String email, String password) {
}
