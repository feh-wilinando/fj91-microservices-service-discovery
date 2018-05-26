


package:
	@ docker rmi -f microservice-service-discovery
	@ echo "Packaging service-discovery project"
	@ mvn clean package && rm -f service-discovery.out


up: package
	@ docker-compose up -d
	@ sleep 10

down:
	@ docker-compose stop && docker-compose rm -vf
	@ rm -f ./nginx/config/loadbalance/*.conf