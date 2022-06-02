//
//  L389_FindTheDifference.swift
//  leetcodeSwift
//
//  Created by Fola Flor on 2022/02/07.
//

import Foundation
class Solution_L389 {
	func findTheDifference(_ s: String, _ t: String) -> Character {

		let chaS: [Character] = s.map{ $0 }.sorted()
		let chaT: [Character] = t.map{ $0 }.sorted()

		for i in 0..<chaS.count{
			if chaS[i] != chaT[i]{
				return chaT[i]
			}
		}

		return chaT[chaT.count-1]
	}
}

//let a : Solution = Solution()
//let result: Character = a.findTheDifference("aaab", "aadab")
//print(result)
