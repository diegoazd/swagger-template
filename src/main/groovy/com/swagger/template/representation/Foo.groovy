package com.swagger.template.representation

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(["metaClass"])
class Foo {
    String propertie1
    String propertie2
    String propertie3
}
