//Q2588
import Foundation

let inputA = readLine()!
let inputB = readLine()!

var A : Int = Int(inputA)!
var B : Int = Int(inputB)!


let out3 = A*(B%10)
let out4 = A*((B%100 - B%10)/10)
let out5 = A*((B-B%100)/100)

print(out3)
print(out4)
print(out5)
print(out3 + out4*10 + out5*100)
