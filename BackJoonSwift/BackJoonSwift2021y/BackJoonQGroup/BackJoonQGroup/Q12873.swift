//
//  Q12873.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/01.
//

import Foundation

func Q12873() {

	let N = Int (readLine()!)!

	var people: [Int] = []
	var step: Int = 1
	var position: Int = 0
	var mov: Int = 0

	people.append(contentsOf: stride(from: 1, through: N, by: 1))


	// ---------------------------------------------------------------------------


	while people.count != 1 {

		people = removePerson(people: people, step: step)
		step += 1
//		print("while \(people)")
	}
	//----------------------------------------------------------------------------

	print(people[0])

	//----------------------------------------------------------------------------




	func removePerson(people: [Int], step: Int ) -> [Int] {

		var arr = people

		let t: Int = (step * step * step)

		mov = t%arr.count-1

		position += mov
		position %= arr.count


		if position == -1 {
			position = arr.count-1
		}

		if position == arr.count {
			position = 0
		}


//
//		print(arr)
//		print(position)

		arr.remove(at: position)

		return arr

	}






}


