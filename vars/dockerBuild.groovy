def call() {
  myapp = docker.build("abigael081497/ledger-service:${env.BUILD_ID}", "--build-arg VERSION=${env.BUILD_ID} .")
}
