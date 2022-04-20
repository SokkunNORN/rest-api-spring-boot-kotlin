package com.sokkun.basicrestapi.service.impl

import com.sokkun.basicrestapi.api.request.ParticipantReq
import com.sokkun.basicrestapi.model.Participant
import com.sokkun.basicrestapi.repository.ParticipantRepository
import com.sokkun.basicrestapi.service.IParticipantService
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class ParticipantService(
    private val participantRepository: ParticipantRepository
) : IParticipantService {
    override fun getAllParticipant(): List<Participant> = participantRepository.findAll()

    override fun selectAParticipant(id: Long): Participant? {
        if (participantRepository.existsById(id)) {
            return participantRepository.getById(id)
        }
        return null
    }

    override fun createParticipant(participantReq: ParticipantReq): Participant {
        val participant = Participant(0, name = participantReq.name, LocalDateTime.now())
        println(participantRepository.findById(10))

        return participantRepository.save(participant)
    }

    override fun updateParticipant(id: Long, participantReq: ParticipantReq): Participant? {
        TODO("Not yet implemented")
    }

    override fun deleteParticipant(id: Long): String {
        TODO("Not yet implemented")
    }
}