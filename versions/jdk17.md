Aprimoramento da linguagem Java
JEP 409: Classes seladas – classes e interfaces seladas restringem outras classes ou interfaces que podem estendê-las ou implementá-las. Esse aprimoramento é mais um aprimoramento do Projeto Amber, que visa aumentar a produtividade do desenvolvedor por meio da evolução da linguagem Java.
 
Atualizações e melhorias para bibliotecas
JEP 306: Restaure a semântica de ponto flutuante Always-Strict – A linguagem de programação Java e a máquina virtual Java, originalmente tinham apenas semântica de ponto flutuante estrita. A partir do Java 1.2, pequenas variações nessas semânticas estritas foram permitidas por padrão para acomodar as limitações das arquiteturas de hardware atuais. Essas variações não são mais úteis ou necessárias, por isso foram removidas pelo JEP 306.
JEP 356: Gerador de número pseudo-aleatório aprimorado – Fornece novos tipos de interface e implementações para geradores de número pseudo-aleatório (PRNGs). Essa mudança melhora a interoperabilidade de diferentes PRNGs e torna mais fácil solicitar um algoritmo com base em requisitos, em vez de codificar uma implementação específica.
JEP 382: Novo pipeline de renderização do macOS – implementa um pipeline Java 2D para macOS usando a API Apple Metal. O novo pipeline reduzirá a dependência do JDK na API Apple OpenGL obsoleta.
 
Suporte para nova plataforma
JEP 391: macOS AArch64 Port – Portas do JDK para a plataforma macOS / AArch64. Esta porta permitirá que os aplicativos Java sejam executados nativamente nos novos computadores Apple Silicon baseados no Arm 64.
 
Removals and Deprecations
JEP 398: descontinuar a API do miniaplicativo para remoção – Todos os fornecedores de navegadores da web removeram o suporte para plug-ins de navegador Java ou anunciaram planos para iniciarem a solução. A API Applet foi descontinuada, mas não para remoção, no Java 9 em setembro de 2017.
JEP 407: Remove RMI Activation – Remove o mecanismo de ativação de Remote Method Invocation (RMI), preservando o resto do RMI.
JEP 410: Remova o AOT experimental e o compilador JIT – O compilador experimental baseado em Java (AOT) e just-in-time (JIT) foram recursos experimentais que não tiveram muita adoção. Por serem opcionais, eles já foram removidos do JDK 16. Este JEP remove esses componentes do código-fonte do JDK.
JEP 411: Obsoleta o Security Manager para Remoção – O Security Manager remonta ao Java 1.0. Não foi o principal meio de proteger o código Java do lado do cliente por muitos anos e, raramente, foi usado para proteger o código do lado do servidor. Removê-lo em uma versão futura ajudará a eliminar uma carga de manutenção significativa e permitirá que a plataforma Java avance.
 
Programas Java de Prova Futura
JEP 403: Encapsular fortemente JDK – internos - Não será mais possível relaxar o forte encapsulamento de elementos internos por meio de uma única opção de linha de comando, como era possível no JDK 9 ao JDK 16. Ainda será possível acessar os APIs internos existentes, mas agora exigirá enumerar, como parâmetros de linha de comando ou atributos de manifesto de arquivo JAR, cada pacote para o qual o encapsulamento deve ser relaxado. Essa mudança levará a aplicativos mais seguros e menos dependências de detalhes de implementação JDK internos que não são padrão.
 
Visualizações e incubadoras para versões posteriores do JDK
JEP 406: Correspondência de padrões para switch (visualização) – Permite que uma expressão seja testada em vários padrões, cada um com uma ação específica, de forma que consultas complexas orientadas a dados, possam ser expressas de forma concisa e segura.
JEP 412: Função externa e API de memória (incubadora) – melhora as APIs de incubação introduzidas no JDK 14 e JDK 15 que permitem que, programas Java interoperem com código e dados fora do tempo de execução Java. Invocando com eficiência funções externas (ou seja, código fora da JVM) e acessando com segurança a memória externa, essas APIs permitem que os programas Java chamem bibliotecas nativas e processem dados nativos sem a fragilidade e complexidade da Java Native Interface (JNI). Essas APIs estão sendo desenvolvidas no Projeto Panamá, que visa melhorar a interação entre código Java e não Java.
JEP 414: API Vector (Segunda Incubadora) – Permite expressar cálculos vetoriais que compilam de forma confiável em tempo de execução para instruções vetoriais otimizadas em arquiteturas de CPU suportadas, alcançando, assim, um desempenho superior aos cálculos escalares equivalentes.