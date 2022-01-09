//
//  Q11728.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/09.
//

import Foundation

func Q11728() {
	let _ = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
	let secondLine = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
	let thridLine = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
	var totalArr: [Int] = []

	totalArr += secondLine
	totalArr += thridLine
	//	totalArr.sort()

	totalArr = quickSort(arr: totalArr)

	var str: String = ""

	for i in totalArr {
		str.append(String(i))
		str.append(" ")
	}

	print(str)

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
