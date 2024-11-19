package com.example.crm.repository

import com.example.crm.entity.Lead
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LeadRepository : JpaRepository<Lead, Long>
