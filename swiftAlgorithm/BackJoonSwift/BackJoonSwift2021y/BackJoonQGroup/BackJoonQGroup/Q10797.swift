import Foundation

func Q10797(){

	var cnt = 0

	let checkNum = Int(readLine()!)!
	let numbers  = readLine()!.split(separator: " ").map { Int($0)! }

	for i in 0..<numbers.count{
		if numbers[i] == checkNum {
			cnt += 1
		}
	}

	print(cnt)
}



