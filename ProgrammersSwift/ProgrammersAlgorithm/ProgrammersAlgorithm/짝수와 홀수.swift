//
//  짝수와 홀수.swift
//  ProgrammersAlgorithm
//
//  Created by Fola Flor on 2022/01/11.
//

import Foundation

func solution(_ num:Int) -> String {

	if num % 2 == 0 {
		return "Even"
	} else {
		return "Odd"
	}
}

func solution1(_ num:Int) -> String {
	let answer: String = num % 2 == 0 ? "Even" : "Odd"
	return answer
}
