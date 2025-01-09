def call(){
  echo "Happy Deploying on ec2 instance"
  sh "docker-compose down && docker-compose up -d"
}
