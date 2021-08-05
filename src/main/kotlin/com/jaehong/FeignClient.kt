package com.jaehong

import org.springframework.web.bind.annotation.GetMapping
import reactivefeign.spring.config.ReactiveFeignClient

@ReactiveFeignClient("client", url = "http://localhost:8082")
interface FeignClient {
    @GetMapping("user/info")
    fun getUserInfo(): String
}