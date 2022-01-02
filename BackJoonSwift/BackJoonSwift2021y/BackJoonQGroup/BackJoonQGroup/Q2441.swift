//
//  Q2441.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/02.
//

import Foundation

func Q2441() {

	let N = Int(readLine()!)!

	for i in stride(from: 0, to: N, by: 1){

		writeSpace(N: i)
		writeStar(i: i, N: N)
	}

	func writeSpace(N: Int) {

		var space: String = ""

		for _ in 0 ..< N {
			space.append(" ")
		}
		print(space , terminator: "")
	}

	func writeStar(i: Int, N: Int) {

		var star: String = ""

		for _ in stride(from: N, to: i, by: -1){
			star.append("*")
		}
		print(star)
	}


}
