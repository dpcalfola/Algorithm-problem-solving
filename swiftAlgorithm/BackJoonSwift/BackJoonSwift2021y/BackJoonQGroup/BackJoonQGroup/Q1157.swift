//
//  Q1157.swift
//  BackJoonQGroup
//
//  Created by Fola Flor on 2022/01/01.
//

import Foundation

func Q1157() {

	var str: String = readLine()!

	str = str.lowercased()
	str = str.uppercased()

	var strArr: [Character] = []

	for i in str {
		strArr.append(i)
	}

	var alphaArr: [Int] = []

	alphaArr.append( strArr.filter {($0) == "A"}.count )
	alphaArr.append( strArr.filter {($0) == "B"}.count )
	alphaArr.append( strArr.filter {($0) == "C"}.count )
	alphaArr.append( strArr.filter {($0) == "D"}.count )
	alphaArr.append( strArr.filter {($0) == "E"}.count )
	alphaArr.append( strArr.filter {($0) == "F"}.count )
	alphaArr.append( strArr.filter {($0) == "G"}.count )
	alphaArr.append( strArr.filter {($0) == "H"}.count )
	alphaArr.append( strArr.filter {($0) == "I"}.count )
	alphaArr.append( strArr.filter {($0) == "J"}.count )
	alphaArr.append( strArr.filter {($0) == "K"}.count )
	alphaArr.append( strArr.filter {($0) == "L"}.count )
	alphaArr.append( strArr.filter {($0) == "M"}.count )
	alphaArr.append( strArr.filter {($0) == "N"}.count )
	alphaArr.append( strArr.filter {($0) == "O"}.count )
	alphaArr.append( strArr.filter {($0) == "P"}.count )
	alphaArr.append( strArr.filter {($0) == "Q"}.count )
	alphaArr.append( strArr.filter {($0) == "R"}.count )
	alphaArr.append( strArr.filter {($0) == "S"}.count )
	alphaArr.append( strArr.filter {($0) == "T"}.count )
	alphaArr.append( strArr.filter {($0) == "U"}.count )
	alphaArr.append( strArr.filter {($0) == "V"}.count )
	alphaArr.append( strArr.filter {($0) == "W"}.count )
	alphaArr.append( strArr.filter {($0) == "X"}.count )
	alphaArr.append( strArr.filter {($0) == "Y"}.count )
	alphaArr.append( strArr.filter {($0) == "Z"}.count )

//	print(alphaArr)

	var sorted = alphaArr

	sorted = sorted.sorted()

	if(sorted[sorted.count-1] == sorted[sorted.count-2]){
		print ("?")
	}else {

		for i in 0 ..< alphaArr.count {
			if (sorted[sorted.count-1] == alphaArr[i]){
				if i == 0 {
					print("A")
				}
				if i == 1 {
					print("B")
				}
				if i == 2 {
					print("C")
				}
				if i == 3 {
					print("D")
				}
				if i == 4 {
					print("E")
				}
				if i == 5 {
					print("F")
				}
				if i == 6 {
					print("G")
				}
				if i == 7 {
					print("H")
				}
				if i == 8 {
					print("I")
				}
				if i == 9 {
					print("J")
				}
				if i == 10 {
					print("K")
				}
				if i == 11 {
					print("L")
				}
				if i == 12 {
					print("M")
				}
				if i == 13 {
					print("N")
				}
				if i == 14 {
					print("O")
				}
				if i == 15 {
					print("P")
				}
				if i == 16 {
					print("Q")
				}
				if i == 17 {
					print("R")
				}
				if i == 18 {
					print("S")
				}
				if i == 19 {
					print("T")
				}
				if i == 20 {
					print("U")
				}
				if i == 21 {
					print("V")
				}
				if i == 22 {
					print("W")
				}
				if i == 23 {
					print("X")
				}
				if i == 24 {
					print("Y")
				}
				if i == 25 {
					print("Z")
				}


			}

		}

	}


}
