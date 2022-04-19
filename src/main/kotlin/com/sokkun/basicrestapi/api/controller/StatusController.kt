package com.sokkun.basicrestapi.api.controller

import com.sokkun.basicrestapi.api.request.StatusReq
import com.sokkun.basicrestapi.api.response.StatusRes
import com.sokkun.basicrestapi.service.impl.StatusService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/status")
class StatusController(val service: StatusService) {

    @GetMapping
    fun getAllStatus(): List<StatusRes> = service.findAllStatus()

    @PostMapping
    fun createStatus(@RequestBody status: StatusReq): StatusRes {
        return service.createStatus(status)
    }

    @PutMapping("/{id}")
    fun updateStatus(@PathVariable("id") id: Long, @RequestBody status: StatusReq): StatusRes? {
        return service.updateStatus(id, status)
    }
}