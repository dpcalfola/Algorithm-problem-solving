//
//  Eratosthenes.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/11.
//

import Foundation
func Eratosthenes() {

	let (a, b): (Int, Int) = (1, 30)
	//print(a, b)

	var totalArr: [Int] = Array(a...b+1)
	let limit: Int = Int(sqrt(Double(b)))
	var primeArr: [Int] = []
	totalArr[0] = -1
	totalArr[1] = -1

	for i in 2...b {
		guard totalArr[i] != -1 else { continue }
		primeArr.append(totalArr[i])
		totalArr[i] = -1
		for j in stride(from: i*i, through: b, by: i) {
			totalArr[j] = -1
		}
	}

	for i in totalArr where i != -1 {
		print(i)
	}

	print(primeArr)


}
