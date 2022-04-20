package com.sokkun.basicrestapi.service

import com.sokkun.basicrestapi.api.request.TransferTypeReq
import com.sokkun.basicrestapi.api.response.TransferTypeRes

interface ITransferTypeService {
    fun findAllTransferType(): List<TransferTypeRes>
    fun createTransferType(transferTypeReq: TransferTypeReq): TransferTypeRes
}