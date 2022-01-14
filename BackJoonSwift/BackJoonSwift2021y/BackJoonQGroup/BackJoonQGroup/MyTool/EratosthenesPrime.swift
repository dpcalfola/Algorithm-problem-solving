//
//  Eratosthenes.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/11.
//

import Foundation
func EratosthenesInt() {

	let (a, b): (Int, Int) = (1, 30)
	var arr: [Int] = Array(0...b+1)
	let limit: Int = Int(sqrt(Double(b)))
	arr[0] = -1
	arr[1] = -1

	for i in 2...limit {
		guard arr[i] != -1 else { continue }
		for j in stride(from: i*i, through: b, by: i) {
			arr[j] = -1
		}
	}

	for i in a...b where arr[i] != -1 {
		print(arr[i])
	}
}

func Eratosthense() {
	let maxNum = 100
	var arr: [Bool] = Array(repeating: false, count: maxNum+1)
	let limit: Int = Int(sqrt(Double(maxNum)))
	arr[0] = true
	arr[1] = true

	for i in 2...limit {
		guard !arr[i] else { continue }
		for j in stride(from: i*i, through: maxNum, by: i) {
			arr[j] = true
		}
	}
}
