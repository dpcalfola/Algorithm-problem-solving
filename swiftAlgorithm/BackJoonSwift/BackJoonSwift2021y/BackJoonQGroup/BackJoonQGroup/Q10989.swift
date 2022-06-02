//
//  Q10989.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/10.
//

import Foundation

func q10989() {
	let N = Int(readLine()!)!
	for i in 1...N {
		print(String(repeating: " ", count: i-1), terminator: "")
		print(String(repeating: "*", count: -2*i+2*N+1))
	}
}
