This is a sample project to demonstrate how to extend [nosqlbench](https://github.com/nosqlbench/nosqlbench)
with new drivers without forking the project or commiting code to the main branch. Also, it demonstrates
building with Gradle instead of the nosqlbench's Maven.
### Build
Note: Gradle will enforce minimum Java version 11.

Note: These steps were tested on MacOS version 10.15.7 but should work on Linux as well
1. In the repository directory: `./gradlew clean installDist`
2. Run the CLI with `./build/install/nosqlbench-driver-sample/bin/nosqlbench-driver-sample`. 
E.g. list found drivers with
`./build/install/nosqlbench-driver-sample/bin/nosqlbench-driver-sample --list-drivers`.
