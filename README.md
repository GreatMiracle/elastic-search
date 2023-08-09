
**install elastic search**
docker network create elastic
docker pull docker.elastic.co/elasticsearch/elasticsearch:8.9.0
docker run --name es01 --net elastic -p 9200:9200 -it docker.elastic.co/elasticsearch/elasticsearch:8.9.0


**install kibana**
docker pull docker.elastic.co/kibana/kibana:8.9.0
docker run --name kib-01 --net elastic -p 5601:5601 docker.elastic.co/kibana/kibana:8.9.0