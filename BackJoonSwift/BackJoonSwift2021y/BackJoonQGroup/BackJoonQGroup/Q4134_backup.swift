////
////  Q4134.swift
////  BackJoonQGroup
////
////  Created by Fola Flor on 2021/12/31.
////
//
//import Foundation
//
//func Q4134(){
//	let caseNum = Int(readLine()!)!
//	var inputNum: Int
//
//	for _ in 0 ..< caseNum {
//
//		inputNum = Int(readLine()!)!
//		doItRockAndRoll(number: inputNum )
//	}
//}
//
//
//func doItRockAndRoll(number: Int){
//
//	var checkNum = number
//
//	while true {
//		if isPrime(n: checkNum){
//			print(checkNum)
//			break
//		} else {
//			checkNum += 1
//		}
//	}
//}
//
//
//func isPrime(n: Int) -> Bool {
//
//	if n <= 1 {
//		return false
//	}
//
//	if n == 2 {
//		return true
//	}
//
//	let rootN = Int( sqrt(Double(n)) )
//
//	for i in 2 ... rootN {
//
//		if n % i == 0 {
//			return false
//		}
//
//	}
//
//	return true
//
//}
//
