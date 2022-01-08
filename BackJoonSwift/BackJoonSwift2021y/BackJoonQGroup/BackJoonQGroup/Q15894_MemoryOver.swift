//
//  Q15894.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/07.
//

import Foundation

func Q15894() {
	let N = Int(readLine()!)!
	let answer = recursiveFunc(T: N)
	print(answer)

	func recursiveFunc(T: Int) -> Int {
		if T == 1 {
			return 4
		}
		return recursiveFunc(T: T-1) + 4
	}
}
