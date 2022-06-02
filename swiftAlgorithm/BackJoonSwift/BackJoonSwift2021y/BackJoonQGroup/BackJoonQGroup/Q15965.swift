//
//  Q15965.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/11.
//

// q15965
//
//import Foundation
//let N = Int(readLine()!)!
//
//let maxNum = 7368787
//var arr: [Bool] = Array(repeating: false, count: maxNum+1)
//let limit: Int = Int(sqrt(Double(maxNum)))
//arr[0] = true
//arr[1] = true
//
//for i in 2...limit {
//	guard !arr[i] else { continue }
//	for j in stride(from: i*i, through: maxNum, by: i) {
//		arr[j] = true
//	}
//}
//// end of Eratosthenes
//
//var primeArr: [Int] = []
//for i in 0..<arr.count {
//	guard !arr[i] else { continue }
//	primeArr.append(i)
//}
//
//print(primeArr[N-1])
