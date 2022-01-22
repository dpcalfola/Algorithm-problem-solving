//
//  Q15873.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/22.
//

import Foundation

func Q15873() {
	let numStr = readLine()!

	// 배열에 쪼개서 넣는다
	let numArr: [Int] = numStr.map{ Int(String($0))! }

	func exec() {
		//1010일 경우
		if numStr == "1010"{
			print(20)
		}
		if numArr.count == 3 && numArr[1] == 0 {
			print(10 + numArr[2])
		}
		if numArr.count == 3 && numArr[2] == 0 {
			print(10 + numArr[0])
		}
		if numArr.count == 2 {
			print(numArr[0] + numArr[1])
		}
	}

	exec()

}

