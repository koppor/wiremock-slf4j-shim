# Wiremock workaround

Workaround for [wiremock#2480](https://github.com/wiremock/wiremock/issues/2480)

1. `gradle jar` to create `wiremock-slf4j-shim.jar`
2. Add it as dependency to your test dependencies

It should also work with [JitPack](https://jitpack.io/):

```kotlin
testImplementation("com.github.koppor:wiremock-slf4j-shim:main-SNAPSHOT')
```
