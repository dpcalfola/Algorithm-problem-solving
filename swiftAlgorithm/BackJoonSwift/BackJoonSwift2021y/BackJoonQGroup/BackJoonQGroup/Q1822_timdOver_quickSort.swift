//
//  Q1822.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/09.
//

import Foundation

func q1822() {

	//q1822

	let _ = readLine()
	let set1: Set<Int> = Set( readLine()!.components(separatedBy: " ").map { Int(String($0))! })
	let set2: Set<Int> = Set( readLine()!.components(separatedBy: " ").map { Int(String($0))! })

	let setAnswer: Set<Int> = set1.subtracting(set2)
	var answerArr: [Int] = [Int](setAnswer)

	answerArr = quickSort(arr: answerArr)

	if answerArr.isEmpty{
		print(0)
	}else{
		print(answerArr.count)
		for i in answerArr {
			print("\(i) ", terminator: "")
		}
	}


	func quickSort(arr: [Int]) -> [Int] {
		if arr.count < 2 {
			return arr
		}
		let pivot = arr[0]
		let less = arr.filter { $0 < pivot }
		let greater = arr.filter { $0 > pivot }
		return quickSort(arr: less) + [pivot] + quickSort(arr: greater)
	}

}
