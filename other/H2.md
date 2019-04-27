# H2 Database configuration in Spring
### Specify where to save data
In file:
```
jdbc:h2:~/test      // in home directory
jdbc:h2:/data/test  // in root directory
jdbc:h2:./test      // in current directory
```
In memory
```
jdbc:h2:mem:test    // multiple connections
jdbc:h2:mem:        // one connection
```

### Persistent in Spring-Boot
You can set the behavior of hibernate on startup by setting this property
```
spring.jpa.hibernate.ddl-auto
```
This is an enum and has the following values:
* `none` No action will be performed
* `validate` Validates the schema, makes no changes to the database
* `update` Updates the schema
* `create` Creates the schema destroying previous data
* `create-drop` Drops the database when the connection is closed

If you want the connection to be persistent you need to set it to either `validate` or `update` 