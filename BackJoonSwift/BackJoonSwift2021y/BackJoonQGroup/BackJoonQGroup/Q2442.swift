//
//  Q2442.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/03.
//

import Foundation

func Q2442() {
	let N = Int(readLine()!)!

	for i in 0 ..< N {
		writeSpace(N: N, i: i)
		writeStar(i: i)
	}

	func writeSpace(N: Int, i: Int) {
		var space = ""
		for _ in stride(from: N-1, to: i, by: -1) {
			space.append(" ")
		}
		print(space, terminator: "")
	}

	func writeStar(i: Int) {
		var star = ""
		for _ in stride(from: 1, through: 2*i+1, by: 1){
			star.append("*")
		}
		print(star)
	}
}
