# Padrões de Projeto

## Padrões aplicados

### Singleton

Esse padrão de projeto consiste em uma classe que garanta apenas uma única instância durante a execução do programa. Caso a classe tente ser instanciada novamente, a instância já criada será retornada.

#### Eager Singleton

A instância do singleton é criada assim que a propriedade estática é definida.

```java
private static final SingletonEager instance = new SingletonEager();

public static SingletonEager getInstance() {
    return instance;
}
```

#### Lazy Singleton

Nessa versão, a instância é gerada na primeira execução do getter. Após isso, o método retornará o objeto previamente criado.

```java
private static SingletonLazy instance;

public static SingletonLazy getInstance() {
    if(instance == null) {
        instance = new SingletonLazy();
    }
    return instance;
}
```

#### Lazy Holder Singleton

Esta versão inclui uma série de benefícios por ser `lazy loaded` e `thread safe`. De acordo com [um post do stackoverflow](https://stackoverflow.com/questions/15019306/regarding-static-holder-singleton-pattern/24018148#24018148), a inicialização da classe é deferida até que ela seja usada de fato.

```java
private static class InstanceHolder {
    public static SingletonLazyHolder instance = new SingletonLazyHolder();
}

public static SingletonLazyHolder getInstance() {
    return InstanceHolder.instance;
}
```
