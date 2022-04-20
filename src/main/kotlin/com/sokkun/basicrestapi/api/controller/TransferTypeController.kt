package com.sokkun.basicrestapi.api.controller

import com.sokkun.basicrestapi.api.request.TransferTypeReq
import com.sokkun.basicrestapi.api.response.TransferTypeRes
import com.sokkun.basicrestapi.service.impl.TransferTypeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/transfer-type")
class TransferTypeController(
    val transferTypeService: TransferTypeService
) {
    @GetMapping
    fun getAllTransferTypes(): List<TransferTypeRes> = transferTypeService.findAllTransferType()

    @PostMapping
    fun createTransferType(@RequestBody transferTypeReq: TransferTypeReq): TransferTypeRes {
        return transferTypeService.createTransferType(transferTypeReq)
    }
}