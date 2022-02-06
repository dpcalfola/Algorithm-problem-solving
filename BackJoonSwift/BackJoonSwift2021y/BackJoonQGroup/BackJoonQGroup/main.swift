import Foundation

var inputNum: [Int] = readLine()!.components(separatedBy: " ").map{ Int($0)! }
let inputString: String = readLine()!

inputNum = inputNum.sorted()

let chaArr: [Character] = inputString.map{ $0 }

if chaArr[0] == "A" {
	print("\(inputNum[0]) ", terminator: "")
	if chaArr[1] == "B"{
		print("\(inputNum[1]) ", terminator: "")
		print("\(inputNum[2]) ", terminator: "")
	} else {
		print("\(inputNum[2]) ", terminator: "")
		print("\(inputNum[1]) ", terminator: "")
	}
} else if chaArr[0] == "B" {
	print("\(inputNum[1]) ", terminator: "")
	if chaArr[1] == "C" {
		print("\(inputNum[3]) ", terminator: "")
		print("\(inputNum[0]) ", terminator: "")
	}else{
		print("\(inputNum[0]) ", terminator: "")
		print("\(inputNum[3]) ", terminator: "")
	}
} else {
	print("\(inputNum[2]) ", terminator: "")
	if chaArr[1] == "A"{
		print("\(inputNum[0]) ", terminator: "")
		print("\(inputNum[1]) ", terminator: "")
	}else{
		print("\(inputNum[1]) ", terminator: "")
		print("\(inputNum[0]) ", terminator: "")
	}
}




//
//
//	  main.swift
//	  BackJoonQGroup
//
//	  Created by Fola Flor on 2021/12/24.
//
//
