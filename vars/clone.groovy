def call(String gitUrl, String gitBranch){
  echo "This is cloning stage of the code from git repo"
  git url: "${gitUrl}", branch: "${gitBranch}"
  echo "Code cloning successfull"
}
