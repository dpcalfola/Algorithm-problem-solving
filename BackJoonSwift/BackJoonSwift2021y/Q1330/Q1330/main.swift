// Q1330
import Foundation

let input = readLine()!
let arrStr : [String] = input.components(separatedBy: " ")

let numA = Int(arrStr[0])!
let numB = Int(arrStr[1])!

if numA > numB {
	print(">")
}else if numA < numB {
	print("<")
}else{
	print("==")
}

