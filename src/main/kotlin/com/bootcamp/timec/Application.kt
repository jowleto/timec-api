package com.bootcamp.timec

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.bootcamp.timec")
		.start()
}

