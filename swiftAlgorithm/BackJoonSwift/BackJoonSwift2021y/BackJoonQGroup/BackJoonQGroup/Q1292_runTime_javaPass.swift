//
//  Q1292.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/09.
//

import Foundation
func q1292() {

	let inputArr: [Int] = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
	let answer = sumOfNums(n: inputArr[1]) - sumOfNums(n: inputArr[0]-1)
	print(answer)

	func sumOfNums(n: Int) -> Int {
		guard n != 1 else { return 1 }
		var group = 1
		var sum = 0
		for i in 1... {
			if i*(i+1)/2 >= n{
				break
			}
			group += 1
		}
		let cnt = n-((group-1)*group)/2
		for i in 1...group-1 {
			sum += i*i
		}
		sum += group*cnt
		return sum
	}

}
