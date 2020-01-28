package dev.alpas.pingcrm

import dev.alpas.Alpas

fun main(args: Array<String>) = Alpas(args).routes { addRoutes() }.ignite()
