//
//  QuickSort.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/10.
//

import Foundation
func quickSort(arr: [Int]) -> [Int] {
	if arr.count < 2 {
		return arr
	}
	let pivot = arr[0]
	let less = arr.filter { $0 < pivot }
	let greater = arr.filter { $0 > pivot }
	return quickSort(arr: less) + [pivot] + quickSort(arr: greater)
}
