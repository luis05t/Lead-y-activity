package com.example.crm.dto

data class ActivityDto(
    var description: String,  // Cambiar de val a var
    var leadId: String? = null
)
