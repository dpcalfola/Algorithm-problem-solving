//
//  Q10828.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/13.
//

import Foundation

//q10828
func q10828() {
	let N = Int(readLine()!)!
	var stack: [Int] = []

	for _ in 0..<N {
		let input = readLine()!
		var pushNum = 0
		var stIndex: String.Index
		if input.contains("push"){
			stIndex = input.index(input.startIndex, offsetBy: 5)
			pushNum = Int(input[stIndex...])!
			stack.append(pushNum)
		}else if input.contains("pop"){
			if stack.isEmpty{
				print(-1)
			}else{
				print(stack.removeLast())
			}
		}else if input.contains("size"){
			print(stack.count)
		}else if input.contains("empty"){
			if stack.isEmpty{
				print(1)
			}else{ print(0) }
		}else if input.contains("top"){
			if stack.isEmpty {
				print(-1)
			}else{print(stack[stack.count-1])}
		}
	}
}
