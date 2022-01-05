//
//  Q1100.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/04.
//

import Foundation

func Q1100() {
	var chessArr: [String] = []
	var answerCnt: Int = 0

	for _ in 0 ..< 8 {
		chessArr.append(readLine()!)
	}

	for i in stride(from: 0, to: 8, by: 2) {
		for j in stride(from: 0, to: 8, by: 2){
			let individualArr = chessArr[i].map { String($0) }
			if(individualArr[j] == "F" ){
				answerCnt += 1
			}
		}
	}

	for i in stride(from: 1, to: 8, by: 2) {
		for j in stride(from: 1, to: 8, by: 2){
			let individualArr = chessArr[i].map { String($0) }
			if(individualArr[j] == "F" ){
				answerCnt += 1
			}
		}
	}
	print(answerCnt)
}
