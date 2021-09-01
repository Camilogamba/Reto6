#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Formulario compra producto
  El usuario debe poder ingresar a la pagina, seleccionar un producto
  y realizar la compra del mismo, el formulario valida los campos requeridos
  para la compra.
  
  @CasoExitoso
  Scenario: Agregar correctamente un producto al carrito,
  					de compras, y diligenciar datos personales
  					hasta metodo de pago.
    Given Abro la pagina y en el buscador digito "macbook"
    When Selecciono abro el primer mackbook
    And le doy click en añadir al carrito, voy al carrito y doy click a checkout 
    And Le doy en comprar e ingreso los datos de la compra y acepto la politica de privacidad
    |strfname|strlname|strlemail                       |strtelephone|strpass|strrpass|straddress    |strcity  |strpostCode|strcountry|strzone     |
    |Camilo  |Gamba   |qcairtaaest@choucairtesting.com |3133333333  |12345  |12345   |calle 57 n 20 |Bogota   |154210     |Colombia  |Cundinamarca|
    Then Verifico que la compra llegue hasta metodo de pago
   @SegundoScenario
    Scenario: Agregar correctamente cinco camaras al carrito
    Given Abro la pagina, en el menu selecciono camaras y abro la segunda camara
    When digito 5 en cantidad y añado al carrito
    Then en el boton del carrito me visualiza la cantidad de camaras que añadi