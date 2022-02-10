//
//  Q2525.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/02/09.
//

import Foundation

func q2525() {

	//Q2525
	let currentTime: [Int] = readLine()!.components(separatedBy: " ").map{ Int($0)! }
	let inputTime: Int = Int(readLine()!)!


	var hour = currentTime[0];
	var minute = currentTime[1];
	let aftermin = minute + inputTime


	// 60분이 넘어면 시간+분으로 바꾼다
	hour += aftermin / 60
	minute = aftermin % 60

	// 24시가 넘어가면 00시로 바꾼다
	hour = hour % 24

	// print
	print(hour , terminator: " ")
	print(minute)
}
