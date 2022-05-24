# springboot-native-image-example

This project shows a simple setup how to build a [SpringBoot](https://spring.io/projects/spring-boot) application as
native image by [GraalVM](https://www.graalvm.org/).

## Build java package

```shell
./mvnw package
```

## Build GraalVM native package

```shell
./mvnw -Pnative -DskipTests package
```

## Build docker image

```shell
./mvnw -Pnative-image -DskipTests spring-boot:build-image
```
