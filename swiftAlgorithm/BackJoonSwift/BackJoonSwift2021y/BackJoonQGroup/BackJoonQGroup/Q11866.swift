//
//  Q11866.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/01.
//

import Foundation

func Q11866() {

	let input: [Int] = readLine()!.components(separatedBy: " " ).map{ Int(String($0))! }

	let N = input[0]
	let mov = input[1]-1

//	print( N , mov )

	var arr: [Int] = []
	arr.append(contentsOf: stride(from: 1, to: N+1, by: 1))

	var position: Int = 0
	var answerArr: [Int] = []

	//---------------------------------------------------------

	while ( arr.count != 0 ){
		position += mov
		position %= arr.count

		answerArr.append(arr[position])
		arr.remove(at: position)

//		print(arr)

	}

//	print(answerArr)

	print("<", terminator: "")

	for i in 0 ..< answerArr.count-1 {
		print("\(answerArr[i]), ", terminator: "")
	}

	print("\(answerArr[answerArr.count-1])>")







}
