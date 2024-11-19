package com.example.crm.mapper

import com.example.crm.dto.ActivityDto
import com.example.crm.entity.Activity

object ActivityMapper {

    // Mapea ActivityDto a Activity
    fun toEntity(activityDto: ActivityDto): Activity {
        val activity = Activity()
        activity.description = activityDto.description ?: "" // Aseguramos que no sea nulo
        return activity
    }

    // Mapea Activity a ActivityDto
    fun toDto(activity: Activity): ActivityDto {
        val activityDto = ActivityDto(
            description = TODO(),
            leadId = TODO()
        )
        activityDto.description = activity.description ?: "" // Aseguramos que no sea nulo
        activityDto.leadId = activity.lead?.id.toString() // leadId puede ser nulo si no hay lead
        return activityDto
    }
}
