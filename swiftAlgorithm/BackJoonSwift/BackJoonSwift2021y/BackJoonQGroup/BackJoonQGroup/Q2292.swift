//
//  Q2292.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/09.
//

import Foundation

func Q2292() {
	let inputNum = Int(readLine()!)!

	var number: Int = 1
	var group = 0

	for i in 0... {
		if number >= inputNum {
			break
		}
		number = number + 6*i
		group = i
	}

	print(group+1)
}
