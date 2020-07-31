# jaxws-rt-charset-example

Passos para reproduzir

1. Abra o SoapUI;
2. No SoapUI, importe o arquivo "Charset-Mock-soapui-project.xml" disponível na raiz desse projeto;
3. Ainda no SoapUI, execute o mock "HelloWsMockService" (dois cliques pra abrir a modal > na modal clicar no botão play verde);
4. Na sua IDE de preferencia, importe esse projeto em formato Maven;
5. Após importado, execute a classe `Client_UTF_8_Example` disponível dentro do módulo `client`;
    - Veja que o request será printado no console e o content-type está com com o espaço depois do ponto e vírgula.
6. Agora execute a classe `Client_ISO_8859_1_Example` disponível dentro do módulo `client`;
    - Veja que o request será printado no console e o content-type está com o espaço antes do ponto e vírgula.
