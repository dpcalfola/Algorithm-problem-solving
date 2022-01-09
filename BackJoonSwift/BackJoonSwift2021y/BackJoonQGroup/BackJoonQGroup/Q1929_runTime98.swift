//
//  Q1929.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/08.
//

import Foundation

func Q1929() {
	let input: [Int] = readLine()!.components(separatedBy: " ").map{ Int(String($0))! }
	let minRange = input[0]
	let maxRange = input[1]
	var Arr: [Int] = Array(minRange...maxRange)
	let rootMaxRange = Int(sqrt(Double(maxRange)))

	//1 제거
	if Arr[0] == 1 {
		Arr[0] = -1
	}

	//소수를 찾고 배열 중 소수의 배수를 -1로 바꾼다.
	for i in 2...rootMaxRange {
		if isPrime(n: i) {
			removeMultipleNum(n: i)
		}
	}

	//배열 중 값이 -1 요소를 제외하고 출력
	for i in 0..<Arr.count where Arr[i] != -1 {
		print(Arr[i])
	}

	//함수: 배열에서 n 을 재외한 n의 배수를 -1 로 바꾼다.
	//배열의 값이 이미 -1 이라면 건너뛴다
	func removeMultipleNum(n: Int) {
		for i in 0..<Arr.count where Arr[i] != n{
			if Arr[i] % n == 0 {
				Arr[i] = -1
			}
		}
	}

	//함수: 소수 판별
	func isPrime(n: Int) -> Bool {
		guard n>=2  else { return false }
		for i in 2..<n where i*i<n {
			guard (n%i != 0) else { return false }
		}
		return true
	}
}
