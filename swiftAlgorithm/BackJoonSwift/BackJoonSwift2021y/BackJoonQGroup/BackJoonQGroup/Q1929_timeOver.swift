//
//  Q1929.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/08.
//

import Foundation

func Q1929_timeOver() {
	let input: [Int] = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }

	let M = input[0]
	let N = input[1]
	var answerArr: [Int] = []

	for i in M...N {
		if isPrime(n: i){
			answerArr.append(i)
		}
	}
	for i in answerArr {
		print(i)
	}
	
	func isPrime(n: Int) -> Bool {
		guard n>=2  else { return false }
		for i in 2..<n where i*i<n {
			guard (n%i != 0) else { return false }
		}
		return true
	}
}
