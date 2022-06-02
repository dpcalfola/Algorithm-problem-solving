//
//  Q4134.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2021/12/31.
//

import Foundation

func Q4134(){
	let caseNum = UInt32(readLine()!)!
	var inputNum: UInt32

	for _ in 0 ..< caseNum {

		inputNum = UInt32(readLine()!)!

		var checkNum = inputNum

		while true {
			if isPrime(n: checkNum){
				print(checkNum)
				break
			} else {
				checkNum += 1
			}
		}


	}

	func isPrime(n: UInt32) -> Bool {

		if n <= 1 {
			return false
		}

		if n == 2 {
			return true
		}

		for i in 2 ... UInt32( sqrt(Double(n)) ) {

			if n % i == 0 {
				return false
			}

		}

		return true

	}
}




