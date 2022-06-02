////
////  Q10610_runTime.swift
////  BackJoonQGroup
////
////  Created by Fola Flor on 2022/01/17.
////



//
//import Foundation
//
//
//// q10610
//
//let N = Int(readLine()!)!
//var arr: [Int] = String(N).map{ Int(String($0))! }
//
//execute()
//
//func execute() {
//	guard arr.contains(0) else { print(-1) ; return }
//	let sum = arr.reduce(0) {$0 + $1}
//	guard sum % 3 == 0 else { print(-1) ; return }
//	arr = arr.sorted(by: >)
//	var str: String = ""
//	for i in arr {
//		str.append(String(i))
//	}
//	print(str)
//}




// without func =>>> rutime error again!!

//
//// q10610
//
//let N = Int(readLine()!)!
//var arr: [Int] = String(N).map{ Int(String($0))! }
//
//if !arr.contains(0) {
//	print(-1)
//} else {
//	let sum = arr.reduce(0) {$0 + $1}
//	if sum % 3 != 0 {
//		print(-1)
//	} else {
//		arr = arr.sorted(by: >)
//		var str: String = ""
//		for i in arr {
//			str.append(String(i))
//		}
//		print(str)
//	}
//}
