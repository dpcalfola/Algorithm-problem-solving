//
//  Q18238.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/02/01.
//

import Foundation

func q18238() {

	//1)
	let str: String = readLine()!

	//2)
	let chaArr: [Character] = str.map{ $0 }

	//3)
	func getIntegerFromChar(c: Character) -> Int {
		let asciiValueOfChar = c.asciiValue
		return Int((asciiValueOfChar! - 65).description)!
	}

	//4-1)
	var position: Int = 0
	func getDistance(position: Int , charValue: Int) -> Int {
		let result1 = abs(charValue - position)
		let result2 = 26 - abs(charValue - position)
		return min(result1, result2)
	}

	//5
	var sum: Int = 0
	for i in chaArr {
		sum += getDistance(position: position, charValue: getIntegerFromChar(c: i))
		position = getIntegerFromChar(c: i)
	}

	print(sum)
}


//
// 1) 문자열을 받음
// 2) 받은 문자열을 쪼개서 배열에 넣는다
// 3) 문자를 숫자로 치환하는 함수를 만든다
// 4-1) 현재 위치에서 목표 좌표까지 거리를 구하는 함수
// 4-1.1) 시작 위치 0
// 4-1.2) 왼쪽이 빠른지 오른쪽이 빠른지
//			A->Z) 오른쪽: 25클릭
//				  왼쪽 : 1클릭

// 5) 숫자를 더한다.
