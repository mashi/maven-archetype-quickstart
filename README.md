[![codecov](https://codecov.io/gh/mashi/maven-archetype-quickstart/branch/main/graph/badge.svg?token=FCOMG51FL3)](https://codecov.io/gh/mashi/maven-archetype-quickstart)

# Description
Java project with maven.


## Software and tools
This project utilizes different tools to help the development:

1. Version control with git to track code changes.
1. Code formatting tool: `mvn fmt:format`.
1. Code style check: `mvn checkstyle:check`.
1. Documentation generation from the source code: `mvn javadoc:javadoc`. The documentation can be accessed at `target/site/apidocs/index.html`.
1. Run unit tests: `mvn test`.
1. Generate code coverage reports with: `mvn test` or `mvn jacoco:report`. The report can be accessed locally at `target/site/jacoco/index.html` or online clicking at the codecov badge above.
1. Utilizes the maven project management tool defined in the `pom.xml` file:
    1. It allows the control of dependencies and plugins. To create reproducible configuration, it is possible to specify the version of each entry.
    1. definition of the build process and its output with `mvn package`.
    1. There are many useful commands to check the configuration and the project. For example:
        - validate: validate project and necessary information
        - compile: compile the source code
        - test: execute unit testing
        - package: deliverables
        - verify: verify quality criteria

1. CI/CD tools. The CI step is composed by:
    1. Unittests to check the code behavior using `mvn test`.
    1. Code coverage to monitor and generate reports about the automated tests.

    And the CD step is composed by:
    1. Generation of the deliverable (javadoc, jar files) following the configuration defined in the `pom.xml`.

    The code runs in a cloud platform that allows the reproduction.
