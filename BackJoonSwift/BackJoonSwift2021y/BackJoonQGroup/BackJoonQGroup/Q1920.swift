//
//  Q1920.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/16.
//

import Foundation

func q1920() {
	//q1920
	let N: Int = Int(readLine()!)!
	let nums1 =	readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
	let M: Int = Int(readLine()!)!
	let nums2 = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
	var set: Set<Int> = []

	for i in nums1 {
		set.update(with: i)
	}

	for i in nums2 {
		set.contains(i) ? print(1) : print(0)
	}
}

//var arr: Set<Int> = [1, 3, 5, 7, 9]
//print(arr.contains(3))

