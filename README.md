# kafka-practice  
  
  
  
## 실행방법  

> .\zookeeper-server-start.bat ..\..\config\zookeeper.properties

> .\kafka-server-start.bat ..\..\config\server.properties

포트 확인  
netstat -a  

> .\kafka-topics.bat --create --bootstrap-server localhost:9092 --topic clc

> .\kafka-console-producer.bat  --broker-list  localhost:9092 --topic clc

> .\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic clc --from-beginning