package com.example.crm.mapper

import com.example.crm.dto.LeadDto
import com.example.crm.entity.Lead

object LeadMapper {

    fun toEntity(leadDto: LeadDto): Lead {
        val lead = Lead()
        lead.name = leadDto.name.toString()
        return lead
    }

    fun toDto(lead: Lead): LeadDto {
        val leadDto = LeadDto()
        leadDto.name = lead.name
        return leadDto
    }
}
