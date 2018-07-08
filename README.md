# modulus-benchmark

This project aims to benchmark test modulo operations using 3 approaches:
* normal
* bitwise
* lowest bit

For each approach, four cases are run in 1000 repetitions. Each repetition a large integer, L, is passed in to determine if even or odd. Negative integer is set using 2's complement. The results are computed in mean and standard deviation.
* positive even integer (981122778)
* positive odd integer (981122771)
* negative even integer (~981122778+1)
* negative odd integer (~981122771+1)

Result shows bitwise is the fastest response time and the most stable approach with mean=727.38ns and sd=510.364694ns.
* normal
  * mean 818.65ns
  * sd 641.8667852ns
* bitwise
  * mean 727.38ns
  * sd 510.364694ns
* lowest bit
  * mean 1874.1325ns
  * sd 1909.085754ns

In normal modulo approach, CPU processor performs integer division by simply subtracting the divisor iteratively and counting the iterations before the result turn negative. Remainder resides in accumulator register when the last positive result is computed.

In bitwise modulo approach, CPU processor performs L AND 0x1 to ensure the rightmost bit is set.

## Benchmark Result
![normal modulo approach](https://docs.google.com/spreadsheets/d/e/2PACX-1vS7f9yvj6Qn7yFXI6iOthRmuqQX4gXVF5khYj9RL-acvnJiTK5sehcnEkkdoZVwi2Ibcp5WuuSPok3E/pubchart?oid=1442758449&format=image)

mean 818.65ns | sd 641.8667852ns

![bitwise modulo approach](https://docs.google.com/spreadsheets/d/e/2PACX-1vS7f9yvj6Qn7yFXI6iOthRmuqQX4gXVF5khYj9RL-acvnJiTK5sehcnEkkdoZVwi2Ibcp5WuuSPok3E/pubchart?oid=1206893043&format=image)

mean 727.38ns | sd 510.364694ns

![lowest bit approach](https://docs.google.com/spreadsheets/d/e/2PACX-1vS7f9yvj6Qn7yFXI6iOthRmuqQX4gXVF5khYj9RL-acvnJiTK5sehcnEkkdoZVwi2Ibcp5WuuSPok3E/pubchart?oid=1506003768&format=image)

mean 1874.1325ns | sd 1909.085754ns
