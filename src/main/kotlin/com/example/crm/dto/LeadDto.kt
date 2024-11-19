package com.example.crm.dto

import jakarta.validation.constraints.NotBlank

class LeadDto {

    @NotBlank(message = "Lead name is required")
    var name: String? = null
}
