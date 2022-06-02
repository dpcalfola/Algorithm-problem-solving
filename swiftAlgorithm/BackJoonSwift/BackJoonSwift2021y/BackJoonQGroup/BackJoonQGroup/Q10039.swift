//
//  Q10039.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2021/12/25.
//

import Foundation

//func Q10039(){
//
//	var a = Int(readLine()!)!
//	var b = Int(readLine()!)!
//	var c = Int(readLine()!)!
//	var d = Int(readLine()!)!
//	var e = Int(readLine()!)!
//
//	if(a<40) {
//		a = 40
//	}
//	if(b<40) {
//		b = 40
//	}
//	if(c<40) {
//		c = 40
//	}
//	if(d<40) {
//		d = 40
//	}
//	if(e<40) {
//		e = 40
//	}
//
//	var avg = (a+b+c+d+e)/5
//	print(avg)
//}


func Q10039(){
	var total = 0

	for _ in 0..<5{

		var input = Int(readLine()!)!
		if input < 40 {
			input = 40
		}

		total += input
	}

	print (total/5)


}
