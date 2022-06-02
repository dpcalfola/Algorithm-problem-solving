//
//  Q8958.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2021/12/28.
//

import Foundation

func Q8958(){

	let n = Int(readLine()!)!

	for _ in 0 ..< n {
		Q8985Case()
	}
}

//
func Q8985Case() {
	let str = readLine()!.components(separatedBy: "")

	var totalScore = 0 ;
	var exScore = 1 ;

	for i in 0 ..< str.count {
		print(type(of: str))

		if (str[i] == "O"){
			totalScore += exScore
			exScore += 1
		}else{
			exScore = 0
		}
	}

	print(totalScore)

}
