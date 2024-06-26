# Descrição

RPGCore é uma API que adiciona novas funcionalidades para a criação de um novo mundo RPG.

O plugin por si só não muda nada, não adiciona nenhum comando e nenhuma funcionalidade diretamente ao jogo. Esse plugin é o core para o desenvolvimento de addons, que centraliza adição de atributos em entidades e itens.

Toda modificação é feita com base em atributos, não mudando nenhum calculo original de combate, defesa, loot ou qualquer outra coisa. O intuito tambem, não é ouvir nenhum hook ou modificar diretamente uma ação, deixando isso à cargo e conciencia dos AddOns. 

Presamos ao maximo a originalidade do Minecraft e o desempenho do servidor, não modificando ou processando um unico 1 tick.

## Instalação

Esse ainda é um repositório teste, instale com a compilação
<!-- Baixe o `.jar` diretamente da pagina de release, e coloque na sua pasta de plugins. A instalação é como um plugin normal. -->

## Compilando

Clone esse repositório e execute os comandos:

```sh
mvn compile && mvn package
```

## AddOns

- @ToDo - InitChar - _distribua pontos iniciais ao iniciar o jogo_
- @ToDo - RequiredStats - _adiciona requerimentos aos itens_
- @ToDo - RPGAnvil - _adiciona stats à itens criados na bigorna_
- @ToDo - RPGEnchantTable - _adiciona stats à itens criados na mesa de encantamentos_
- @ToDo - RPGItens - _adiciona stats aos itens dropados, de baus, e outros_
- @ToDo - RPGLevels - _adiciona leveis ao personagem, dando pontos para distribuir nos atributos_
- @ToDo - PassiveSkills - _adiciona skills passivas com base no level e nos atributos_
- @ToDo - RPGSkills - _adiciona skills com base no level e atributos_
- @ToDo - RPGParty - _adiciona party ao jogos, para que jogadores possam evoluir juntos_
- @ToDo - RPGPVP - _melhora o sistema de PVP, protegendo players com diferença muito grande de level_

## Contribuição

Pull requests são muito bem vindos. Para ideias, abra um issue primeiro para discutir sobre suas ideias.

## Documentação

@ToDo

## AddOn Exemplo

@ToDo

## License

[GPL v3.0](https://raw.githubusercontent.com/Andradina-Minecraft-Fun/RPGCore/main/LICENSE)