//
//  Q10953.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/04.
//

import Foundation


func Q10953() {

	let testCase = Int(readLine()!)!

	for _ in 0 ..< testCase {
		let inputStr = readLine()!
		let str: [String] = inputStr.map { String ( $0 ) }
		let a = Int(str[0])!
		let b = Int(str[2])!
		print(a+b)
	}
}
