import Foundation

// 배열에서 두 수를 뽑는 모든 경우의수
// 하나의 수를 뽑고
// 다음 인덱스에서 마지막 인덱스까지 돈다
// 두 번쨰 수를 뽑고
// 다음 인덱스에서 마지막 인덱스까지 돈다
// timeOver

// 0*1 + 0*2 + 0*3 + 0*4 = 0*(1+2+3+4)
// 1*2 + 1*3 + 1*4       = 1*(2+3+4)
// 2*3 + 2*4             = 2*(3+4)
// 3*4                   = 3*(4)

// 두번째 인덱스부터 마지막 인덱스까지의 합을 구한다
// 어차피 반복문을 두번 돌긴 해야함

// for 문 하나로 답을 더해야함 (잘 안됨...)




let N = Int(readLine()!)!
let arr = readLine()!.components(separatedBy: " ").map { Int($0)! }

var bigSum = 0

for i in 0..<arr.count{
	var smallSum = 0
	for j in stride(from: i+1, to: arr.count, by: 1) {
		smallSum += arr[j]
	}
	bigSum += arr[i]*smallSum
}

print(bigSum)







//
//
//	  main.swift
//	  BackJoonQGroup
//
//	  Created by Fola Flor on 2021/12/24.
//
//
