package com.example.crm.controller

import com.example.crm.entity.Lead
import com.example.crm.service.LeadService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/leads")
class LeadController {

    @Autowired
    lateinit var leadService: LeadService

    // Obtener todos los leads
    @GetMapping
    fun getLeads(): List<Lead> {
        return leadService.getLeads()
    }

    // Crear un nuevo lead
    @PostMapping
    fun createLead(@RequestBody lead: Lead): Lead {
        return leadService.saveLead(lead)
    }

    // Obtener un lead por su ID
    @GetMapping("/{id}")
    fun getLeadById(@PathVariable id: Long): Lead? {
        return leadService.getLeadById(id)
    }

    // Actualizar el estado de un lead
    @PostMapping("/{id}/set-status")
    fun setLeadStatus(@PathVariable id: Long, @RequestBody status: String): Lead {
        val lead = leadService.getLeadById(id) ?: throw Exception("Lead not found")
        lead.status = status  // Actualiza el estado del lead
        return leadService.saveLead(lead)
    }
}
