//
//  Q11021.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2021/12/27.
//

import Foundation

func Q11021() {

	let num = Int(readLine()!)!

	for _ in 0..<num {
		let addArry = readLine()!.components(separatedBy: " ")
		let result = addArry[0] + addArry[1]
		print(result)
	}
}

