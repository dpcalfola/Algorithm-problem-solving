//Q8393

//import Foundation
//
//let input = readLine()!
//let inputArr : [String] = input.components(separatedBy: " ")
//var N = Int(inputArr[0])!
//
////print(N)
//
//var sum = 0
//
//for i in 1...N{
//	sum += i
//}
//
//print(sum)



import Foundation

func Q8393(){
	if let input = readLine(), let N = Int(input) {
		var sum = 0
		for i in 1 ... N {
			sum += i
		}

		print(sum)
	}
}

Q8393()
