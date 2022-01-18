//
//  Q10845.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/15.
//

import Foundation

func q10845() {
	// Q10845

	var queue: [Int] = []
	let N = Int(readLine()!)!

	for _ in 0..<N {
		let input:[String] = readLine()!.components(separatedBy: " ").map { String($0) }
		let firstIn = input[0]
		switch firstIn {
			case "push":
				queue.append(Int(input[1])!)
			case "pop":
				queue.isEmpty ? print(-1) : print(queue.removeFirst())
			case "size":
				print(queue.count)
			case "empty":
				queue.isEmpty ? print(1) : print(0)
			case "front":
				queue.isEmpty ? print(-1) : print(queue.first!)
			case "back":
				queue.isEmpty ? print(-1) : print(queue.last!)
			default:
				break
		}
	}
}
