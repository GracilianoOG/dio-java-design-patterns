# 📑 Padrões de Projeto

## 🎯 Padrões aplicados

### 📌 Singleton

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

### 📌 Strategy

O padrão Strategy tem por objetivo simplificar a variação de algoritmos para solucionar um mesmo problema.

Para tornar o aprendizado mais simples, implementei esse padrão utilizando um estilo de jogo de RPG. Um personagem possui diferentes estratégias de ataque para escolher.

**Funciona da seguinte maneira:**

1. Uma interface possui métodos para serem implementados (Attack).

```java
// Interface Attack
void attack();
```

2. Outras classes irão implementar essa interface, cada uma aplicando uma estratégia diferente (SwordAttack, BowAttack e MagicAttack).

```java
// Classe SwordAttack
@Override
public void attack() {
    System.out.println("Swing the sword!");
}
```

3. A classe de contexto (Character) mantém uma referência para a interface da estratégia (Attack).

```java
// Classe Character
private Attack attackStrategy; // Referência para o tipo do ataque

public void setAttackStrategy(Attack attackStrategy) {
    this.attackStrategy = attackStrategy; // Mudança de estratégia
}

public void attack() {
    attackStrategy.attack(); // Realiza o ataque atual
}
```

4. O jogador agora pode ter diferentes tipos de ataque durante seu combate:

```java
Attack swordAtk = new SwordAttack();
Attack bowAtk = new BowAttack();
Attack magicAtk = new MagicAttack();

Character player = new Character();

player.setAttackStrategy(swordAtk);
player.attack(); // Swing the sword!

player.setAttackStrategy(bowAtk);
player.attack(); // Shoot arrows!

player.setAttackStrategy(magicAtk);
player.attack(); // Cast spell!
```

### 📌 Facade

O design pattern `Facade` é utilizado para simplificar o uso de diferentes interfaces em uma interface comum e simples de se utilizar. É inclusive algo que já fiz enquanto desenvolvia um jogo sem nem mesmo entender o que era.

No exemplo desenvolvido, utilizei a ideia de uma engine fake de um jogo qualquer. A classe `Engine` abstrai a complexidade de se utilizar as outras classes individualmente. Por exemplo, o método `startGame()` inicia a música, ativa os _listeners_ de entrada (poderia ser do teclado, mouse, etc) e checa por colisões.

```java
System.out.println("Starting game...");
this.audioManager.playMusic();
this.inputManager.listen();
this.collisionManager.detectCollision();
```

Sendo assim, com a implementação do padrão de projeto `Facade` no projeto, simplifica-se a utilização e integração dos subsistemas em uma interface mais amigável de se trabalhar.

```java
Engine engine = new Engine();
engine.startGame(); // Método que utiliza de outros subsistemas
```

## 🧑🏻‍💻 Author

| [<img src="https://avatars.githubusercontent.com/u/72778164?s=96&v=4"><br><sub>GracilianoOG</sub>](https://github.com/GracilianoOG) |
| :---------------------------------------------------------------------------------------------------------------------------------: |
|                                       [Linkedin](https://www.linkedin.com/in/gabrielgmbarros)                                       |
