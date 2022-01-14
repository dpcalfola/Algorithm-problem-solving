////
////  q2789.swift
////  BackJoonQGroup
////
////  Created by Fola Flor on 2022/01/12.
////
//
//import Foundation
//
//
//// q2789
//
//let inputA = readLine()!.components(separatedBy: " ").map { Int(String($0))! }
//var arr = readLine()!.components(separatedBy: " ").map { Int(String($0))! }
//
//let card: Int = inputA[0]
//var temp: Int = 0
//var sumArr: [Int] = []
//
//arr.sort()
//
//for i in 0..<card-2 {
//	for j in 1..<card-1 where j != i {
//		for k in 2..<card where k != j && i != k {
//			sumArr.append(arr[i] + arr[j] + arr[k])
//		}
//	}
//}
//
//sumArr.sort()
////print(sumArr)
//
//for i in sumArr {
//	if i > inputA[1]{
//		break
//	}
//	temp = i
//}
//
//print(temp)
