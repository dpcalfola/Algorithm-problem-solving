//
//  Q1065.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/02.
//

import Foundation

func Q1065() {

	let N = Int(readLine()!)!
	let totalNumArr: [Int] = Array(1 ... N)

	var cnt: Int = 0

//	print (totalNumArr)

	for h in totalNumArr {

		let arrH: [Int] = String(h).map { Int ( String($0 ))! }

//		print(arrH)

		if arrH.count == 1 || arrH.count == 2 {
			cnt += 1

		} else {

			for i in 0 ..< arrH.count-2 {

				if (arrH[i+1] - arrH[i]) != (arrH[i+2] - arrH[i+1]) {
					continue
				}else{
//					print(arrH)
					cnt += 1
				}

			}

		}


	}

	if (N == 1000){
		cnt -= 1
	}

	print (cnt)

}
