package com.example.crm.controller

import com.example.crm.entity.Activity
import com.example.crm.entity.Lead
import com.example.crm.service.ActivityService
import com.example.crm.service.LeadService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/activities")
class ActivityController {

    @Autowired
    lateinit var activityService: ActivityService

    @Autowired
    lateinit var leadService: LeadService

    // Obtener todas las actividades
    @GetMapping
    fun getActivities(): List<Activity> {
        return activityService.getActivities()
    }

    // Crear una nueva actividad
    @PostMapping
    fun createActivity(@RequestBody activity: Activity): Activity {
        return activityService.saveActivity(activity)
    }

    // Obtener una actividad por su ID
    @GetMapping("/{id}")
    fun getActivityById(@PathVariable id: Long): Activity? {
        return activityService.getActivityById(id)
    }

    // Asociar una nueva actividad a un lead específico
    @PostMapping("/leads/{leadId}")
    fun createActivityForLead(@PathVariable leadId: Long, @RequestBody activity: Activity): Activity {
        val lead: Lead = leadService.getLeadById(leadId) ?: throw Exception("Lead not found")
        activity.lead = lead  // Asocia la actividad con el lead
        return activityService.saveActivity(activity)
    }
}
