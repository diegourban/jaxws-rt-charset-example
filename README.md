# jaxws-rt-charset-example

Guia passo-a-passo

1. Abrir o SoapUI;
2. Importar o arquivo "Charset-Mock-soapui-project.xml" disponível na raiz desse projeto;
3. Ainda no SoapUI, execute o mock "HelloWsMockService" (dois cliques pra abrir a modal > na modal clicar no botão play verde);
4. No projeto java, execute a classe Client_UTF_8_Example dentro do módulo client;
    - Veja que será printado no console o request e o content-type está com com o espaço depois do ponto e vírgula.
5. Agora execute a classe Client_ISO_8859_1_Example dentro do módulo client;
    - Veja que será printado no console o request e o content-type está com o espaço antes do ponto e vírgula.
