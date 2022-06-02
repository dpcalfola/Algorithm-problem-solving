//
//  Q11022.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/02.
//

import Foundation

func Q11022() {

	let caseNum = Int(readLine()!)!

	for i in 0 ..< caseNum {

		execute(caseNum: i+1)

	}

	func execute(caseNum: Int) {

		let inputNums: [Int] = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }

		let num1 = inputNums[0]
		let num2 = inputNums[1]
		let sum = num1 + num2


		print("Case #\(caseNum): \(num1) + \(num2) = \(sum)")

	}
}


