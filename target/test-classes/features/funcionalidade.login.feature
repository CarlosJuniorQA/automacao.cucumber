#Author: carlosjunior.quality@gmail.com

Feature: Fluxo de Login
  Como usuário do site de compras sauce demo
  Quero informar os dados de acesso
  Para acessar a área de compras logadas

 Background:
Given que esteja na tela de login
  
  Scenario: Login Valido
   
    When preencher os dados de login
    And clicar em login 
    Then usuário deve acessar home page
   

  Scenario: Login invalido senha
  
    When preencher o username
    And nao preencher a senha
    And clicar em login
    Then usuário deve receber mensagem de erro
    
    
   Scenario: Login invalido user
  
    When preencher o username
    And preencher a senha
    And clicar em login
    Then usuário deve receber mensagem de erro
   



  