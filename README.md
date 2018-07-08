# modulus-benchmark

This project aims to benchmark test modulo operations using 3 approaches:
* normal
* bitwise
* lowest bit

For each approach, four cases are run in 15000 repetitions. Each repetition a large 32bit integer, L, is passed in to determine if even or odd. Negative integer is set using 2's complement. The results are computed in mean and standard deviation.
* positive even integer (981122778)
* positive odd integer (981122771)
* negative even integer (~981122778+1)
* negative odd integer (~981122771+1)

Result shows bitwise is the fastest response time and the most stable approach with mean=141.2504ns and sd=193.6351007ns.
* normal
  * mean 141.5801887ns
  * sd 270.0700275ns
* bitwise
  * mean 141.2504ns
  * sd 193.6351007ns
* lowest bit
  * mean 170.2621508ns
  * sd 2081.331526ns

In normal modulo approach, CPU processor performs integer division by simply subtracting the divisor iteratively and counting the iterations before the result turn negative. Remainder resides in accumulator register when the last positive result is computed.

In bitwise modulo approach, CPU processor performs L AND 0x1 to ensure the rightmost bit is set.

## Benchmark Result
![normal modulo approach](https://camo.githubusercontent.com/03ab70f21b05af6d8727575913f0517d4c36f0d8/68747470733a2f2f646f63732e676f6f676c652e636f6d2f7370726561647368656574732f642f652f32504143582d31765337663979766a36516e377946584936694f7468526d757151583467585646356b68596a39524c2d6163766e4a69544b35736568636e456b6b646f5a56776932496263703557757553506f6b33452f70756263686172743f6f69643d3134343237353834343926666f726d61743d696d616765)

mean 141.5801887ns | sd 270.0700275ns

![bitwise modulo approach](https://camo.githubusercontent.com/55994ce0b79edc72a93b2f8c68fa6bb0acd61b4c/68747470733a2f2f646f63732e676f6f676c652e636f6d2f7370726561647368656574732f642f652f32504143582d31765337663979766a36516e377946584936694f7468526d757151583467585646356b68596a39524c2d6163766e4a69544b35736568636e456b6b646f5a56776932496263703557757553506f6b33452f70756263686172743f6f69643d3132303638393330343326666f726d61743d696d616765)

mean 141.2504ns | sd 193.6351007ns

![lowest bit approach](https://camo.githubusercontent.com/5887952ead35a9de5b30522dd758207892ba2a70/68747470733a2f2f646f63732e676f6f676c652e636f6d2f7370726561647368656574732f642f652f32504143582d31765337663979766a36516e377946584936694f7468526d757151583467585646356b68596a39524c2d6163766e4a69544b35736568636e456b6b646f5a56776932496263703557757553506f6b33452f70756263686172743f6f69643d3135303630303337363826666f726d61743d696d616765)

mean 170.2621508ns | sd 2081.331526ns
