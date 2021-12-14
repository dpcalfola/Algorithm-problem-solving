/*
 문제
 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

 출력
 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

 */

import Foundation

// MVC 패턴으로 풀어보기

// View
func readNum() -> String {
	guard let value = readLine() else {
		return ""
	}
	return value
}

func output(value: Any) {
	print(value)
}

// controller -> 계산을 수행
func stringToArr(value: String) -> [String] {
	return value.components(separatedBy: " ")
}

func stringToInt(value: String) -> Int {
	guard let intValue = Int(value) else {
		return 0
	}
	return intValue
}

func mul(first: Int, second: Int) -> Int {
	return first * second
}

// Model -> 데이터를 저장
struct Model {
	let first: Int
	let second: Int
}

// View
let inputValue = readNum()

// controller
let numArr = stringToArr(value: inputValue)
let first = stringToInt(value: numArr[0])
let second = stringToInt(value: numArr[1])

// model
let numModel = Model(first: first, second: second)

// controller
let result = mul(first: numModel.first, second: numModel.second)

// View
output(value: result)

