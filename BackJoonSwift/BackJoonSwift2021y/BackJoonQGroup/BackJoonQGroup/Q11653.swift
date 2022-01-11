////
////  Q11653.swift
////  BackJoonQGroup
////
////  Created by Fola Flor on 2022/01/10.
////
//
//import Foundation
//
//
////q11653
//import Foundation
//
//let N = Int(readLine()!)!
//
//var answerArr: [Int] = []
//var currentNum = N
//
//while true {
//	if currentNum == -1 {
//		break
//	}
//	// 남은 수가 소수일 때 배열에 넣고 탈출
//	if isPrime(n: currentNum) {
//		answerArr.append(currentNum)
//		break
//	}
//	currentNum = divideNum(n: currentNum)
//}
//
//for i in answerArr {
//	print(i)
//}
//
////
//func divideNum(n: Int) -> Int {
//	if n == 1 {
//		return -1
//	}
//	for i in 2... {
//		if n % i == 0 {
//			answerArr.append(i)
//			return n/i
//		}else{
//			continue
//		}
//	}
//	return -1
//}
//
////
//func isPrime(n: Int) -> Bool {
//	guard n>=2  else { return false }
//	for i in 2..<n where i*i<=n {
//		guard (n%i != 0) else { return false }
//	}
//	return true
//}
