# Phobos OpenAPI

## Setting up

In your build.gradle:
```groovy
repositories {
    //... Your repositories
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/phobos-ltd/OpenAPI")
    }
}

dependencies {
    // ... Your dependencies
    implementation "org.phobos:openapi:X.X"
}

```

Replace X.X with the latest version

## Usage

Usage example:

```java
public class OpenAPITest implements ModInitializer {
    @Override
    public void onInitialize() {
        OpenSync.synchronizer().synchronize(() -> {
            OpenAPI.getProvider().getModule("AutoCrystal").flatMap(module -> module.getSetting("Render", Boolean.class)).ifPresent(setting -> {
                System.out.println(setting.getDescription());
            });
        });
    }
}
```

NOTE: Currently only module & setting access is available, 
    but will be extended to support other controllers