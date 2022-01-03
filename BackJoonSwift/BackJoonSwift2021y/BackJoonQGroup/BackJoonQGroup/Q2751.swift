//
//  Q2751.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/03.
//

import Foundation

func Q2751() {

	let N = Int(readLine()!)!
	var arr: [Int] = []

	for _ in 0 ..< N {
		arr.append(Int(readLine()!)!)
	}

	arr.sort()

	for i in arr {
		print(i)
	}

}
