package com.example.crm.service

import com.example.crm.entity.Activity
import com.example.crm.repository.ActivityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ActivityService {

    @Autowired
    lateinit var activityRepository: ActivityRepository

    // Obtener todas las actividades
    fun getActivities(): List<Activity> {
        return activityRepository.findAll()
    }

    // Guardar una nueva actividad
    fun saveActivity(activity: Activity): Activity {
        return activityRepository.save(activity)
    }

    // Obtener una actividad por su ID
    fun getActivityById(id: Long): Activity? {
        return activityRepository.findById(id).orElse(null)  // Retorna la actividad si existe, o null si no
    }
}
