# kafka-practice
# BASIC

실행방법

> .\zookeeper-server-start.bat ..\..\config\zookeeper.properties

> .\kafka-server-start.bat ..\..\config\server.properties

netstat -a

> .\kafka-topics.bat --create --bootstrap-server localhost:9092 --topic clc

> .\kafka-console-producer.bat  --broker-list  localhost:9092 --topic clc

> .\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic clc --from-beginning