package com.example.crm.entity

import jakarta.persistence.*

@Entity
data class Activity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    var description: String = "",

    @ManyToOne
    @JoinColumn(name = "lead_id")  // La columna que almacenará la referencia a Lead
    var lead: Lead? = null
)
