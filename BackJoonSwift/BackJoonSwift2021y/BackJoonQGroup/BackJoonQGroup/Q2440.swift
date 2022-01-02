//
//  Q2440.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/02.
//

import Foundation

func Q2440(){

	let N = Int(readLine()!)!

	for i in stride(from: N, through: 1, by: -1) {

		printStar(NumOfStar: i)

	}

	func printStar(NumOfStar: Int){

		var str: String = ""

		for _ in 1 ... NumOfStar {
			str.append("*")
		}

		print (str)

	}

}
