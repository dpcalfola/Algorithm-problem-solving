//
//  Q10250.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/12.
//

import Foundation

//// q10250
//
//let testCase: Int = Int(readLine()!)!
//
//for _ in 0..<testCase {
//	let input = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
//	let (H, W, N): (Int, Int, Int) = (input[0], input[1], input[2])
//	let answer = printAnswer(H: H, W: W, N: N)
//	print(answer)
//}
//
//func printAnswer(H: Int, W:Int, N: Int) -> Int {
//	var floor = ( N % H ) * 100
//	var room = (N/H) + 1
//	if N%H == 0 {
//		floor = H*100
//		room = N/H
//	}
//	return floor + room
//}
