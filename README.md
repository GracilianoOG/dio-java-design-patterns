# Padrões de Projeto

## Padrões aplicados

### Singleton

Esse padrão de projeto consiste em uma classe que garanta apenas uma única instância durante a execução do programa. Caso a classe tente ser instanciada novamente, a instância já criada será retornada.

#### Eager Singleton

A instância do singleton é criada assim que a propriedade estática é definida.

```java
private static final SingletonEager instance = new SingletonEager();

private SingletonEager() {
    super();
}

public static SingletonEager getInstance() {
    return instance;
}
```

#### Lazy Singleton

Nessa versão, a instância é gerada na primeira execução do getter. Após isso, o método retornará o objeto previamente criado.

```java
private static SingletonLazy instance;

private SingletonLazy() {
    super();
}

public static SingletonLazy getInstance() {
    if(instance == null) {
        instance = new SingletonLazy();
    }
    return instance;
}
```

#### Lazy Holder Singleton

```java
private static class InstanceHolder {
    public static SingletonLazyHolder instance = new SingletonLazyHolder();
}

private SingletonLazyHolder() {
    super();
}

public static SingletonLazyHolder getInstance() {
    return InstanceHolder.instance;
}
```
