//
//  약수의 개수와 덧셈.swift
//  ProgrammersAlgorithm
//
//  Created by Fola Flor on 2022/02/02.
//

import Foundation

func solution(_ left:Int, _ right:Int) -> Int {

	var result = 0

	for i in left...right {
		if countOfAliquot(number: i) % 2 == 0 {
			result += i
		}else{
			result -= i
		}
	}
	return result
}

func countOfAliquot(number: Int) -> Int {
	var count = 0
	for i in 1...number {
		if number%i == 0 {
			count += 1
		}
	}
	return count
}

