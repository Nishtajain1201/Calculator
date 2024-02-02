#!/bin/bash
java -cp . Assignment3 -ln "" -sm 4
java -cp . Assignment3 -ln "5" -sm 4
java -cp . Assignment3 -ln "" -im
java -cp . Assignment3 -ln "1 a b" -sm 4
(echo "1 2 3 4 5" && echo "6") | java -cp . Assignment3 -im
(echo "1 2 3" && echo "5") | java -cp . Assignment3 -im
(echo "-1 -2.00 -3.55 0" && echo "5") | java -cp . Assignment3 -im
(echo "55 22 22 -39 393"  && echo "5") | java -cp . Assignment3 -im
(echo "1 -2 3" && echo "5") | java -cp . Assignment3 -im
(echo "1 2.10 3.00" && echo "7") | java -cp . Assignment3 -im