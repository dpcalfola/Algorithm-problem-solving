import Foundation

let inA = readLine()!.components(separatedBy: " ").map{ Int($0)! }
let inB = readLine()!.components(separatedBy: " ").map{ Int($0)! }.sorted()

print(inB[inA[1]-1])






//
//
//	  main.swift
//	  BackJoonQGroup
//
//	  Created by Fola Flor on 2021/12/24.
//
//
