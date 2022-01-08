//
//  Q2446.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/06.
//

import Foundation

func Q2446() {
	let N = Int(readLine()!)!

	for i in 0 ..< 2*N-1 {

		var space: String = ""
		var star: String = ""

		if i < N {
			for _ in 0 ..< i {
				space.append(" ")
			}
		}else{
			for _ in i ..< 2*N-2 {
				space.append(" ")
			}
		}
		print(space, terminator: "")

		if i < N {
			for _ in stride(from: 4*(N-i)-2 , to: 0, by: -2) {
				star.append("*")
			}
		}
		else{
			for _ in stride(from: 0, to: 4*((N-1)-i)-2 , by: -2){
				star.append("*")
			}
		}
		print(star)
	}
}
