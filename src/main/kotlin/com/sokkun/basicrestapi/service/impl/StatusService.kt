package com.sokkun.basicrestapi.service.impl

import com.sokkun.basicrestapi.api.request.StatusReq
import com.sokkun.basicrestapi.api.response.StatusRes
import com.sokkun.basicrestapi.model.Status
import com.sokkun.basicrestapi.repository.StatusRepository
import com.sokkun.basicrestapi.service.IStatusService
import org.springframework.stereotype.Service

@Service
class StatusService(
    private val statusRepo: StatusRepository
): IStatusService {
    override fun findAllStatus(): List<StatusRes> = statusRepo.findAll().map { StatusRes(it.id, it.name) }
    override fun createStatus(status: StatusReq): StatusRes {
        val status = Status(1, status.name, status.description)
        val createdStatus = statusRepo.save(status)
        return StatusRes(createdStatus.id, createdStatus. name)
    }

}