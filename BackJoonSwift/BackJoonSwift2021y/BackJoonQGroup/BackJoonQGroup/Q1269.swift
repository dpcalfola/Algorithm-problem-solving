//
//  Q1269.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/09.
//

import Foundation

func q1269() {
	let _: [Int] = readLine()!.components(separatedBy: " ").map { Int( String($0))! }
	let set1: Set<Int> = Set<Int>(readLine()!.components(separatedBy: " ").map{ Int(String($0))! })
	let set2: Set<Int> = Set<Int>(readLine()!.components(separatedBy: " ").map{ Int(String($0))! })

	//let set = (set1.subtracting(set2)).union(set2.subtracting(set1))
	let set = set1.symmetricDifference(set2)
	print(set.count)
}
