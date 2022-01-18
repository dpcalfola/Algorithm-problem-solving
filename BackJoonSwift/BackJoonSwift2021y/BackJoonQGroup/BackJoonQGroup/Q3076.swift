//
//  Q3076.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/17.
//

import Foundation

func q3076() {

	let i1 = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
	let i2 = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }

	let R = i1[0]
	let C = i1[1]
	let A = i2[0]
	let B = i2[1]

	func printLine1(C: Int, B:Int){
		for i in 1...C {
			if i%2 == 1 {
				print(String(repeating:"X", count: B), terminator: "")
			}else{
				print(String(repeating: ".", count: B), terminator: "")
			}
		}
		print()
	}

	func printLine2(C: Int, B:Int){
		for i in 1...C {
			if i%2 != 1 {
				print(String(repeating:"X", count: B), terminator: "")
			}else{
				print(String(repeating: ".", count: B), terminator: "")
			}
		}
		print()
	}

	for i in 0..<R*A {
		if (i/A)%2 == 0 {
			printLine1(C: C, B: B)
		}else{
			printLine2(C: C, B: B)

		}
	}
}
