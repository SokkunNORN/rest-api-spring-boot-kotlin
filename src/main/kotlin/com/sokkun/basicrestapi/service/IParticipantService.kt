package com.sokkun.basicrestapi.service

import com.sokkun.basicrestapi.api.request.ParticipantReq
import com.sokkun.basicrestapi.model.Participant

interface IParticipantService {
    fun getAllParticipant(): List<Participant>
    fun selectAParticipant(id: Long): Participant?
    fun createParticipant(participantReq: ParticipantReq): Participant
    fun updateParticipant(id: Long, participantReq: ParticipantReq): Participant?
    fun deleteParticipant(id: Long): String
}