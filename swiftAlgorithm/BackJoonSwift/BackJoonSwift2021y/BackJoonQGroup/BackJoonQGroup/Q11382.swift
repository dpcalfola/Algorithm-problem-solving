//
//  Q11382.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2021/12/24.
//

import Foundation

func Q11382() {
	let input = readLine()!
	let arrString: [String] = input.components(separatedBy: " ")
	let a = Int(arrString[0])!
	let b = Int(arrString[1])!
	let c = Int(arrString[2])!

	print(a+b+c)

}
