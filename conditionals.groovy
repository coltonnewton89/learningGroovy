package com.test.demo

def num = 11

// if else
if (num == 10){
    println "num is 10"
}else{
    println "num is not 10"
}

// switch case
def x = 10

def result = ""

switch(x){
    case 0:
        result = "x is zero"
        break
        case {x>0}:
        result = "x is positive"
        break
        case {x < 0}:
        result = "x is negative"
        break
        default:
        result = "invalid number"
}

println result 