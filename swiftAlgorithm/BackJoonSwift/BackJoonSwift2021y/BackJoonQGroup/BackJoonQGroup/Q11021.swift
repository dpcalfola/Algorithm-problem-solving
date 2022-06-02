//
//  Q11021.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2021/12/27.
//

import Foundation

func Q11021() {

	let num = Int(readLine()!)!

	for i in 1...num {

		let addArry = readLine()!.components(separatedBy: " ")
		let result =  Int(addArry[0])! + Int(addArry[1])!
		print("Case #\(i): \(result)")

//		print("==================")
//		print(type(of: result))
	}
}

