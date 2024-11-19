package com.example.crm.service

import com.example.crm.entity.Lead
import com.example.crm.repository.LeadRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LeadService {

    @Autowired
    lateinit var leadRepository: LeadRepository

    // Obtener todos los leads
    fun getLeads(): List<Lead> {
        return leadRepository.findAll()
    }

    // Guardar un nuevo lead
    fun saveLead(lead: Lead): Lead {
        return leadRepository.save(lead)
    }

    // Obtener un lead por su ID
    fun getLeadById(id: Long): Lead? {
        return leadRepository.findById(id).orElse(null)
    }
}
