//
//  Q1357.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/14.
//

import Foundation


func q1357() {
	let input: [Int] = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
	var x = input[0]
	var y = input[1]


	print(rev(num: rev(num: x)+rev(num: y)))

	func rev(num: Int) -> Int {
		let tempArr: [Int] = String(num).map{ Int(String($0))! }.reversed()
		var temp: String = ""
		for i in tempArr {
			temp.append(String(i))
		}
		return Int(temp)!
	}
}
