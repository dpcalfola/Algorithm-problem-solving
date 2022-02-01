let str = "ABCDE"
let strArr: [String] = str.map{ String($0) }
print(strArr)

let cha: Character = "A"
print(cha.asciiValue)
print(cha.asciiValue!)
print(type(of: cha.asciiValue!))

let StringValueOfCha: String = cha.asciiValue!.description
let intValueOfCha: Int = Int(StringValueOfCha)!

let intValueOfCha2: Int = Int(cha.asciiValue!.description)!
print(intValueOfCha)


//
//
//	  main.swift
//	  BackJoonQGroup
//
//	  Created by Fola Flor on 2021/12/24.
//
//
