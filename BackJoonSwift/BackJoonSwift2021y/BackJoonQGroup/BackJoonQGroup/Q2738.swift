//
//  Q2738.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/15.
//

import Foundation

func q2738() {
	let matrixSize: [Int] = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
	let N = matrixSize[0]
	let M = matrixSize[1]

	var row1: [Int] = []
	var row2: [Int] = []
	var sumRow: [Int] = []

	// input row1
	for _ in 0..<N {
		let inputLine = readLine()!.components(separatedBy: " ").map { Int(String($0))! }
		for j in 0..<M {
			row1.append(inputLine[j])
		}
	}
	// input row2
	for _ in 0..<N {
		let inputLine = readLine()!.components(separatedBy: " ").map { Int(String($0))! }
		for j in 0..<M {
			row2.append(inputLine[j])
		}
	}
	// sum
	for i in 0..<row1.count {
		sumRow.append(row1[i] + row2[i])
	}
	// print
	for i in 0..<sumRow.count {
		print("\(sumRow[i]) ", terminator: "")
		if i%M == M-1 {
			print()
		}
	}
}

