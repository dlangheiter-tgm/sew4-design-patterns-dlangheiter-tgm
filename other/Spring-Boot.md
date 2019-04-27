# SEW Test Fragen

Folgende Fragen sind ausschließlich über die Spring-Dokumentation und -API zu recherchieren und in einem README.md zu dokumentieren (Quellen **IMMER** angeben, siehe zweite Tafel)

## Fragen

1. Beschreibe folgende Annotationen:
   1. 
      1. `@SpringBootApplication`
      2. `@Bean`
      3. `@RestController`
      4. `@RequestMapping`
   2. Was sind Annotationen?
   3. Welche Möglichkeiten gibt es diese selbst zu implementieren?
   4. Wie hängen Annotationen mit Interfaces zusammen? Welche Gemeinsamkeiten gibt es?
   5. Kann man `@SpringBootApplication` auch anders anschreiben?
   6. Welche `@Target` Optionen gibt es?
   7. Erläutere genau die Verwendung von `@Retention`?
2. x[]
   1. Wo erwartet sich SpringBoot Konfigurations-File?
   2. Wie geht das gradle-plugin für SpringBoot mit den config-files um?
   3. Wie kann man eigene Config-Settings in Spring-Boot setzten?
   4. Wo kann man die wichtigsten default-configs von SpringBoot vorfinden?
   5. Welche Config-File können gesetzt werden und wofür?

## Antworten

#### 1. Beschreibe folgende Annotationen

##### `@SpringBootApplication`



##### `@Bean`

Markiert eine Methode als Bean-Generator. Der Standard-Name von dem Bean ist der Methoden Name. Mann kann aber ein Array an Namen angeben, wobei der erste der Primärname ist und die anderen Aliase.

##### `@RestController`

##### `@RequestMapping`

#### 1a Was sind Annotationen

#### 1b Welche Möglichkeiten gibt es diese selbst zu implementieren?

#### 1c Wie hängen Annotationen mit Interfaces zusammen? Welche Gemeinsamkeiten gibt es?

#### 1d Kann man `@SpringBootApplication` auch anders anschreiben?

#### 1e Welche `@Target` Optionen gibt es?

#### 1f Erläutere genau die Verwendung von `@Retention`?

### 2. Beantworte folgende Fragen

#### 2a Wo erwartet sich SpringBoot Konfigurations-File?

#### 2b Wie geht das gradle-plugin für SpringBoot mit den config-files um?

#### 2c Wie kann man eigene Config-Settings in Spring-Boot setzten?

#### 2d Wo kann man die wichtigsten default-configs von SpringBoot vorfinden?

#### 2e Welche Config-File können gesetzt werden und wofür?

## Kenn mich nicht aus

- [ ] Was macht das Gradle-Plugin mit den vorgefundenen application.properties file?

## Resources

[1] [Definition von @SpringBootApplication; Spring Boot Docs, zuletzt besucht am 8.4.2019; online](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/SpringBootApplication.html)