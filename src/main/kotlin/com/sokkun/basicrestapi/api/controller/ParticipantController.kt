package com.sokkun.basicrestapi.api.controller

import com.sokkun.basicrestapi.api.request.ParticipantReq
import com.sokkun.basicrestapi.model.Participant
import com.sokkun.basicrestapi.service.impl.ParticipantService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/participant")
class ParticipantController(
    private val participantService: ParticipantService
) {

    @GetMapping
    fun getAllParticipants(): List<Participant> = participantService.getAllParticipant()

    @GetMapping("/{id}")
    fun selectAParticipant(@PathVariable id: Long): Participant? = participantService.selectAParticipant(id)

    @PostMapping
    fun createParticipant(@RequestBody participantReq: ParticipantReq): Participant = participantService.createParticipant(participantReq)
}