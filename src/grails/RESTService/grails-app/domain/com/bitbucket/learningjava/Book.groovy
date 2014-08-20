package com.bitbucket.learningjava

import grails.rest.*

@Resource(uri='/books')
class Book {

	String title
	String ISBN
	static constraints = { title blank:false }
}
