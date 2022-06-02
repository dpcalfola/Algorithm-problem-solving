//
//  Q1076.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/04.
//

import Foundation

func Q1076() {

	let c1 = readLine()!
	let c2 = readLine()!
	let m1 = readLine()!

	let answer: Int = ( getRestVal(c: c1)*10 + getRestVal(c: c2) ) * getRestM(m: m1)
	print(answer)

	func getRestVal(c: String) -> Int {
		switch(c){
			case "black":
				return 0
			case "brown":
				return 1
			case "red":
				return 2
			case "orange":
				return 3
			case "yellow":
				return 4
			case "green":
				return 5
			case "blue":
				return 6
			case "violet":
				return 7
			case "grey":
				return 8
			case "white":
				return 9
			default:
				return -1
		}
	}

	func getRestM(m: String) -> Int {
		switch(m){
			case "black":
				return 1
			case "brown":
				return 10
			case "red":
				return 100
			case "orange":
				return 1000
			case "yellow":
				return 10000
			case "green":
				return 100000
			case "blue":
				return 1000000
			case "violet":
				return 10000000
			case "grey":
				return 100000000
			case "white":
				return 1000000000
			default:
				return -1
		}
	}
}
