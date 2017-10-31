package com.swagger.template.controller

import com.swagger.template.representation.Foo
import io.swagger.annotations.Api
import org.json.JSONObject
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/test/")
@Api
class ApiController {

    @GetMapping(value = "{value}", produces = "application/json")
    String getSimpleString (@PathVariable String value) {
        JSONObject.quote(value)
    }

    @GetMapping(value = "{value}/{value2}/{value3}", produces = "application/json")
    Foo getObject(@PathVariable String value, @PathVariable String value2, @PathVariable String value3) {
       new Foo(propertie1: value, propertie2: value2, propertie3: value3)
    }

    @PostMapping(produces = "application/json")
    Foo postObject(@RequestBody Foo foo) {
       foo
    }

    @PutMapping(value = "{id}", produces = "application/json")
    Foo putObject(@PathVariable String id, @RequestBody Foo foo) {
        foo
    }

    @DeleteMapping(value = "{id}", produces = "application/json")
    ResponseEntity<Void> deleteObject(@PathVariable String id) {
        ResponseEntity.ok().build()
    }
}
