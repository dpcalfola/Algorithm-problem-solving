//
//  Q10817.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/08.
//

import Foundation

func Q10817() {
	var arr: [Int] = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
	arr.sort()
	print(arr[1])
}
