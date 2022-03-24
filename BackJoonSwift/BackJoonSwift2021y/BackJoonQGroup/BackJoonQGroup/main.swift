


//
//
//	  main.swift
//	  BackJoonQGroup
//
//	  Created by Fola Flor on 2021/12/24.
//
//

//q11948

import Foundation

var scienceScore: [Int] = []
var societyScore: [Int] = []

for _ in 0..<4 {
	scienceScore.append(Int(readLine()!)!)
}
for _ in 0..<2 {
	societyScore.append(Int(readLine()!)!)
}

scienceScore.sort(by: >)
societyScore.sort(by: >)

var answer = 0

for i in 0..<3 {
	answer += scienceScore[i]
}

answer += societyScore[0]

print(answer)


