//
//  Q11050.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/03.
//

import Foundation


func Q11050() {

	let inputArr = readLine()!.components(separatedBy: " ").map { Int (String ( $0 ))! }

	let N = inputArr[0]
	let tempK = inputArr[1]
	let K = min(tempK, N-tempK)

	let numerator: Int = permutation(n: N, r: K)
	let denominator: Int = factorial(n: K)

	let combination = numerator/denominator

	print(combination)

	func permutation(n: Int , r: Int) -> Int {
		var permu = 1
		for i in stride(from: n, through: (n-r)+1 , by: -1){
			permu *= i
		}
		return permu
	}

	func factorial(n: Int) -> Int {
		var facto = 1
		for i in stride(from: n, through: 1, by: -1) {
			facto *= i
		}
		return facto
	}

}
