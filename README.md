# JAVA-Study
### JAVA 공부 및 테스트

##### 2020-04-21
* Sorting 추가
* 배열 관련 궁금증 추가
* Programmers 풀던거 추가

##### 2020-04-22
* 알고리즘 정렬 관련 추가
	- simple(slow) sort
		1. Bubble sort(거품 정렬)
  			+ 맨 왼쪽의 원소와 바로 옆 원소를 비교, 한칸씩 우측으로 이동하며 비교를 진행, 가장 큰 수가 맨 오른쪽으로 갈때까지 반복 후 가장 큰 수가 맨 오른쪽에 위치하면 가장 큰 수를 제외하고 다시 맨 왼쪽에서 비교 진행
		2. Insertion sort(삽입 정렬)
			+ 기준 원소를 정한 뒤 기준원소 좌측과 우측을 나눠 좌측은 정렬된 상태, 우측은 미정렬 상태로 정하고 기준원소를 우측으로 이동하며 정렬 진행
		3. Selection sort(선택 정렬)
			+ 루프를 돌면서 가장 큰(혹은 가장 작은) 원소를 가장 우측(혹은 가장 좌측)의 원소와 교환, 교환된 가장 큰(혹은 가장 작은) 원소는 제외하고 루프를 돌려 교환 반복

##### 2020-04-23
* 알고리즘 정렬 관련 추가
	- fast sort
	: 재귀함수를 활용
		1. Merge sort(병합 정렬)
			+ 더이상 나눠지지 않을때까지 모든 원소를 나눈 뒤 한 쌍씩(처음엔 2개, 다음엔 4개 그 다음엔 8개...) 짝 지어 정렬을 반복
		2. Quick sort(퀵 정렬)
			+ 기준 원소를 정한 뒤 기준원소보다 큰 값과 작은값이 존재하는 배열로 나눈 후 나눈 배열안에서 또 기준 원소를 정하고 기준 원소 좌측과 우측을 비교하며 기준 원소보다 작으면 좌측, 크면 우측으로 정렬
* 정규 표현식 테스트 추가
	- 숫자, 한글 문자열 추가
* 검색 알고리즘 추가
	- 이진 검색
		1. 정렬이 되어있다는 가정 하에 검색
		2. 중앙 원소를 기준으로 찾는 값이 작으면 좌측, 크면 우측으로 검색
	- 순차 탐색
		1. 첫번째 원소부터 마지막 원소까지 루프를 돌려서 검색