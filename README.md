# Music Generator
By Gabriel Costa



### Objetivo

Este projeto criado na cadeira de Tópicos Avançados em Engenharia de Software da Universidade Federal do Ceará,
com o professor João Bosco tem como finalidade aplicar os conhecimentos adquiridos no decorrer da cadeira.



### Descrição

O projeto tem como escopo a geração de música a partir de emoções. A composição é modelada a partir de estruturas
predeterminadas pelo usuário como versos, ritmo, tonalidade e emoções. Então é gerado um arquivo com o código para entrada
no programa [Sonic Pi](https://sonic-pi.net)



### Metamodelo

Composição é caracterizado por info, ritmo, partes, estrutura.

As informações são:
- Nome da Composição;
- Tom da música ('C','C#','D'...)
- Tonalidade ('major' ou 'minor')
- Semente de randomização (valor inteiro)

O ritmo é configurado com:
- Compasso ('4/8','3/4'...)
- Velocidade da música (em BPM)
- Estilo (representando os tipos de toques na bateria)

As partes são compostas por versos e cada verso possui:
- Emoticon (representando a emoção)
- Instrumentos que compõe a harmonia da música (produzem acordes)
- Instrumentos que compõe a melodia da música (produzem notas)
- Id do verso (se o id para dois versos com mesmo emotion foi igual então a melodia e a  harmonia se repetem)

A estrutura é definida quando se organiza as partes como desejado.



### Instruções

**Pré-Condições**
- [Sirius - Obeo Design](https://www.obeodesigner.com/en/product/sirius) downloaded, installed and configured
- [Sonic Pi](https://sonic-pi.net) installed

**Passos**
- Criar Instância Dinâmica a partir de `Composition` no projeto: 
  > musicgenerator > model > musicgenerator.ecore > ... > Composition
- Editar arquivo `.xmi` gerador informando campos mensionados na seção [Metamodelo](https://github.com/Gabriel-cdn/music-generator-dsl/tree/master#metamodelo)
- Executar arquivo `generate.mtl` com `Launch Acceleo Application` em:
  > org.eclipse.acceleo.module.musicgenerator > src > org.eclipse.acceleo.module.musicgenerator.main > generate.mtl
- Copiar código gerado para Sonic Pi e executar a música


### Como a música é gerada?

**Emoticons**

Cada emoticon possui um conjunto de parâmetro pre-determinados:
- Região de oitavas se tocam as notas (0 representa notas mais baixa e 100 notas mais altas)
- Duração média dos acordes na harmonia (0 representa duração mínima e 100 duração máxima)
- Predominância de acordes menores e maiores (0 representa maior frequência de acordes menores e 100 de acordes maiores)
- Duração média das notas na melodia (0 representa duração mínima e 100 duração máxima)

**Estatística**

As notas são geradas randomicamente predefinidos pela semente de randomização mensionada no [Metamodelo](https://github.com/Gabriel-cdn/music-generator-dsl/tree/master#metamodelo).
Vale notar que para o mesmo valor de semente sempre são geradas as mesmas notas.
Se o emoticon está definido para o valor de 75 para a região de oitavas isso quer dizer que para todas as notas
consideradas numa proporção de 0 a 100 as notas que estiverem na faixa 75 terão mais probabilidade de serem sorteadas.

**Bateria**
A bateria não é randômica. As batidas são predeterminadas pelo estilo do ritmo definido.
Ela foi apenas incorporada para dar um preenchimento melhor para a música



### Limitações e trabalhos futuros...
- Pode-se tentar explorar geração de uma melodia diferente para cada instrumento,
sendo cada melodia definida por um emoticon para cada instrumento
- Gerar batidas aleatória para bateria
- Para esse trabalho as notas são tocadas uma seguida das outras, ou seja, sem tempo de silêncio entre elas, 
podendo se explorar mais o tempo
- Criar uma interface agradável para o usuário criar suas composições emotivas..haha


### Divirta-se!   :smile:  :+1:



