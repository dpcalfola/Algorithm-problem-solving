//
//  InputCodes.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2021/12/27.
//

import Foundation

func InputCodes() {

	let input = readLine()!.split(separator: " ").map { Int($0)! } // 배열로 받기
	let input2 = Int(readLine()!)! // 하나 받기

	print(input)
	print(input2)
}
