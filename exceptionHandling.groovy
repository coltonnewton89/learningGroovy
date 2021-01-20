package com.test.demo

try {
    int i = 1/0
}catch(Exception exp) {
    println "I am inside exception block"
    println exp.getCause() + exp.getMessage()
}
finally{
    println "i am inside of finally block"
}