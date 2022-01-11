//
//  평균 구하기.swift
//  ProgrammersAlgorithm
//
//  Created by Fola Flor on 2022/01/11.
//

import Foundation

func solution(_ arr:[Int]) -> Double {
	var sum = 0 ;
	for i in arr {
		sum += i
	}
	let avg: Double = Double(sum) / Double(arr.count)
	return avg
}
