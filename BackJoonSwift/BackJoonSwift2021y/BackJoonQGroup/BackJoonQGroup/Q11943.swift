//
//  Q11943.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/01.
//

import Foundation

func Q11943() {

	let input1 = readLine()!.split(separator: " ").map { Int(String($0))! }
	let input2 = readLine()!.split(separator: " ").map { Int(String($0))! }

//	print("\(input1) \(input2)")

	let sum1 = input1[0] + input2[1]
	let sum2 = input2[0] + input1[1]

	let answer = min(sum1 , sum2)

	print(answer)

	
}
