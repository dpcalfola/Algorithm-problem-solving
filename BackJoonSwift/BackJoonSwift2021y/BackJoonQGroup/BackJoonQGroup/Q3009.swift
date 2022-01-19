//
//  Q3009.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/18.
//

import Foundation

func q3009() {

	let in1 = readLine()!.components(separatedBy: " ").map{ Int($0)! }
	let in2 = readLine()!.components(separatedBy: " ").map{ Int($0)! }
	let in3 = readLine()!.components(separatedBy: " ").map{ Int($0)! }
	let p1: (x: Int, y: Int) = (in1[0], in1[1])
	let p2: (x: Int, y: Int) = (in2[0], in2[1])
	let p3: (x: Int, y: Int) = (in3[0], in3[1])
	var p4: (x: Int, y: Int) = (0, 0)

	if p1.x == p2.x {
		p4.x = p3.x
	} else if p2.x == p3.x {
		p4.x = p1.x
	} else {
		p4.x = p2.x
	}

	if p1.y == p2.y {
		p4.y = p3.y
	} else if p2.y == p3.y {
		p4.y = p1.y
	} else {
		p4.y = p2.y
	}

	print("\(p4.x) \(p4.y)")
}
