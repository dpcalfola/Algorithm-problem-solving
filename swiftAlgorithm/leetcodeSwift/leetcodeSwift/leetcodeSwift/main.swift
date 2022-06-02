//
//  main.swift
//  leetcodeSwift
//
//  Created by Fola Flor on 2022/02/07.
//

import Foundation

func getConcatenation(_ nums: [Int]) -> [Int] {

	let ansNum = nums + nums
	return ansNum
}

let nums = [ 1, 2, 3 ]
let answer: [Int] = getConcatenation(nums)
print(answer)
