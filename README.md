

## Links



## Environments

For this case I use two android devices, moto 72 and moto edge 50 fusion, review serenity.conf 

## Commands

Run tests and generate reports

```bash
.\gradlew clean test -Denvironment=moto72 aggregate reports
```

```bash
.\gradlew clean test aggregate reports --info --stacktrace
```

```bash
.\gradlew clean test aggregate reports
```

## Links

### 🔧 Herramientas y Configuración

- **Appium Inspector:**

  https://inspector.appiumpro.com/

- **Instalar Herramientas:**

  https://github.com/qa-conf/how-to-install-this-tools

- **Maven Repository:**

  https://mvnrepository.com/

- **Compatibilidad de Versiones (Serenity):**

  https://github.com/serenity-bdd/serenity-core

- **Plugin Serenity Gradle:**

  https://github.com/serenity-bdd/serenity-gradle-plugin

- **Reporte Adicional (Serenity):**

  https://serenity-bdd.github.io/docs/reporting/additional_reports

- **Repositorio Base Automatización:**

  https://github.com/qa-conf/mobile-appium-automation-serenitybdd


> *Rama `ejemplo-ios`: base iPhone*
>
> *Rama `screenplay`: Android con patrón Screenplay*

---

### 📱 Appium Capabilities

- **General Capabilities (Appium):**

  https://appium.io/docs/en/latest/guides/caps/

- **iOS (XCUITest only):**

  https://appium.github.io/appium.io/docs/en/writing-running-appium/caps/#xcuitest-only

- **Session Capabilities:**

  https://appium.io/docs/en/latest/guides/caps/


---

### 🍏 Mapeos iOS

- **Predicate String:**

  https://developer.apple.com/library/archive/documentation/Cocoa/Conceptual/Predicates/Articles/pSyntax.html

- **Class Chain:**

  https://developer.apple.com/documentation/xctest/xcuielementquery?language=objc

- **Class Chain Rules (Facebook WebDriverAgent):**

  https://github.com/facebookarchive/WebDriverAgent/wiki/Class-Chain-Queries-Construction-Rules


---

### 🧪 Serenity BDD

- **Serenity Ensure (Screenplay):**

  https://serenity-bdd.github.io/docs/screenplay/screenplay_ensure


---

### ⚙️ Herramientas DevOps / CI

- **Device Farmer (Granja de dispositivos local):**

  https://github.com/DeviceFarmer/stf

- **Jenkins Plugin – HTML Publisher:**

  https://plugins.jenkins.io/htmlpublisher/

- **CircleCI:**

  https://app.circleci.com/

- **Docker:**

  https://www.docker.com/