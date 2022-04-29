package com.example.plugins

import com.example.routes.getAllHeroes
import com.example.routes.root
import com.example.routes.searchHeroes
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*
import javax.naming.AuthenticationException


fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
        searchHeroes()

//        get("/test2") {
//            throw AuthenticationException()
//        }

        static("/images") {
            resources("images")
        }
    }
}
