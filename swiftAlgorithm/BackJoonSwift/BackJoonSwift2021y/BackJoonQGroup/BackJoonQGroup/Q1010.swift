//
//  Q1010.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/03.
//

import Foundation

func Q1010() {

	let testCase = Int(readLine()!)!

	for _ in 0 ..< testCase {

		let input = readLine()!.components(separatedBy: " ").map { Int(String($0))! }
		let n = input[1]
		var r = input[0]

		r = min (r , n-r)

		let answer = combination(n: n, r: r)
		print(answer)

	}

	func permutation(n: Int , r: Int) -> Int {
		if r == 0 {
			return 1
		}
		var permu = 1
		for i in stride(from: n, through: (n-r)+1 , by: -1){
			permu *= i
		}
		return permu
	}

	func factorial(r: Int) -> Int {
		if r == 0 {
			return 1
		}
		var facto = 1
		for i in stride(from: r, through: 1, by: -1) {
			facto *= i
		}
		return facto
	}

	func combination(n: Int, r: Int) -> Int {
		return permutation(n: n, r: r) / factorial(r: r)
	}
	
}
