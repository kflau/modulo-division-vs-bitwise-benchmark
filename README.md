# modulus-benchmark

This project aims to demostrate 1's complement and 2's complement in Java and benchmark test modulo operations using 3 approaches:
* normal
* bitwise
* lowest bit

For each approach, four cases are run in 400 repetitions. The results are computed in mean and standard deviation.
* positive even integer (981122778)
* positive odd integer (981122771)
* negative even integer (~981122778+1)
* negative odd integer (~981122771+1)

Result shows bitwise is the fastest and the most stable approach with mean=727.38ns and sd=510.364694ns.

## Benchmark Result
![alt text](https://docs.google.com/spreadsheets/d/e/2PACX-1vS7f9yvj6Qn7yFXI6iOthRmuqQX4gXVF5khYj9RL-acvnJiTK5sehcnEkkdoZVwi2Ibcp5WuuSPok3E/pubchart?oid=879078498&format=image)

mean 818.65ns

sd 641.8667852ns

![alt text](https://docs.google.com/spreadsheets/d/e/2PACX-1vS7f9yvj6Qn7yFXI6iOthRmuqQX4gXVF5khYj9RL-acvnJiTK5sehcnEkkdoZVwi2Ibcp5WuuSPok3E/pubchart?oid=1345989249&format=image)

mean 727.38ns

sd 510.364694ns

![alt text](https://docs.google.com/spreadsheets/d/e/2PACX-1vS7f9yvj6Qn7yFXI6iOthRmuqQX4gXVF5khYj9RL-acvnJiTK5sehcnEkkdoZVwi2Ibcp5WuuSPok3E/pubchart?oid=1170977008&format=image)

mean 1874.1325ns

sd 1909.085754ns
