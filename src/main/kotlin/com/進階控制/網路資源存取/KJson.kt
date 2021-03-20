package com.進階控制.網路資源存取

import java.net.URL


val jsonPath ="https://data.tycg.gov.tw/api/v1/rest/datastore/0daad6e6-0632-44f5-bd25-5e1de1e9146f?format=json&limit=200"

fun main() {
    val url = URL(jsonPath)
    val jsonText = url.readText()
    print(jsonText)
}