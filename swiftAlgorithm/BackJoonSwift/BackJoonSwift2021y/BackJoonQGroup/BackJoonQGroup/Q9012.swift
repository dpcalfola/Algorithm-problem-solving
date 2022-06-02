//
//  Q9012.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/03.
//

import Foundation

func Q9012(){

	let testCase = Int(readLine()!)!

	for _ in 0 ..< testCase {
		let str: String = readLine()!
		let arr: [String] = str.map { String ($0) }

		if calculate(arr: arr) {
			print("YES")
		}else{
			print("NO")
		}
	}

	func calculate(arr: [String]) -> Bool {

		var counter: Int = 0

		for i in arr {
			if i == "(" {
				counter += 1
			}else{
				counter -= 1
			}

			if counter < 0 {
				return false
			}

		}

		if counter == 0 {
			return true
		}else{
			return false
		}
	}
}
