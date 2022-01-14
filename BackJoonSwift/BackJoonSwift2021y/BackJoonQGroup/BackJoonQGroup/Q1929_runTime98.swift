//
//  Q1929.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/08.
//

import Foundation

func Q1929() {
	let input = readLine()!.components(separatedBy: " ").map{ Int(String( $0 ))! }
	let (a, b):(Int, Int) = (input[0], input[1])
	var totalArr: [Int] = Array(0...b+1)
	let limit: Int = Int(sqrt(Double(b)))
	totalArr[0] = -1
	totalArr[1] = -1
	for i in 2...limit {
		guard totalArr[i] != -1 else { continue }
		for j in stride(from: i*i, through: b, by: i) {
			totalArr[j] = -1
		}
	}
	for i in a...b where totalArr[i] != -1 {
		print(totalArr[i])
	}
}
