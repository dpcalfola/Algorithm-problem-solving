//
//  Q4344.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/01.
//

import Foundation

func Q4344() {
	let testCase = Int( readLine()!)!

	for _ in 0 ..< testCase {

		var stuArr: [Int] ;
		var numOfStudent: Int ;
		var avg: Int = 0;
		var sum: Int = 0;
		var numOfGood: Double = 0 ;
		var answer: Double = 0.0 ;

		stuArr = readLine()!.components(separatedBy: " ").map { Int ( String ( $0 ))! }

		numOfStudent = stuArr.removeFirst();

//		print(numOfStudent)
//		print(stuArr)

		// 향상된 for 문
		for i in stuArr {
			sum += i
		}

		avg = sum / stuArr.count ;
//		print(avg)

		for i in stuArr {
			if i > avg {
				numOfGood += 1
			}
		}

//		print(numOfGood)

		answer = ( numOfGood / Double(stuArr.count) ) * 100

//		print (answer)

		let answerStr: String = String(format: "%.3f", answer)

		print("\(answerStr)%")




	}


}
