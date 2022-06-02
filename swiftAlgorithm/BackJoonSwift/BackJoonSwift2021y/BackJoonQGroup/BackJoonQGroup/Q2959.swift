//
//  Q2959.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/09.
//

import Foundation

func q2959() {
	var inputArr: [Int] = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
	inputArr.sort()
	let answer = inputArr[0]*inputArr[2]
	print(answer)
}
