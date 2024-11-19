package com.example.crm.entity

import jakarta.persistence.*

@Entity
data class Lead(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    var name: String = "",

    @OneToMany(mappedBy = "lead", cascade = [CascadeType.ALL], orphanRemoval = true)
    val activities: List<Activity> = mutableListOf(), // Relación OneToMany

    var status: String? = null // Aquí se agrega el campo 'status'
)
