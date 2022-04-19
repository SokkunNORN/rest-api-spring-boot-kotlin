package com.sokkun.basicrestapi.service

import com.sokkun.basicrestapi.api.request.StatusReq
import com.sokkun.basicrestapi.api.response.StatusRes

interface IStatusService {
    fun findAllStatus(): List<StatusRes>
    fun createStatus(status: StatusReq): StatusRes
    fun updateStatus(id: Long, status: StatusReq): StatusRes?
}