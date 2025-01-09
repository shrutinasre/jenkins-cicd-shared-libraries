def call(String url, String branch){
  echo "This is cloning stage of the code from git repo"
  git url: ${url}, branch: ${branch}
  echo "Code cloning successfull"
}
