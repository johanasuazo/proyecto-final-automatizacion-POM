@FLUJOSREGISTRO
Feature: Realizar flujo basico y alternos para registrarse
  Como usuario quiero poder registrarme en JPetStore


  Background:
    Given el usuario ingrese a JPetStore
    When el usuario de clic en Sign In
    And el usuario de clic en register now

  @REGISTROCORRECTO
  Scenario Outline: Verificar registro correcto en JpetStore
    And el usuario diligencie los campos obligatorios del formulario
      | <data> |
    And el usuario de clic en Save Account Information
    Then el usuario volvera al Inicio

    Examples:
      | data |
      | 0    |
      | 1    |

  @REGISTROINCORRECTO
  Scenario Outline: Verificar registro incorrecto en JpetStore
    And el usuario ingresa un usuario ya existente
      | <data> |
    And el usuario de clic en Save Account Information
    Then el sistema muestra mensaje de error

    Examples:
      | data |
      | 0    |

  @CAMPOSVACIOS
  Scenario Outline: Verificar registro con campos vacios en JpetStore
    And el usuario no ingresa campos obligatorios
      | <data> |
    And el usuario de clic en Save Account Information
    Then el sistema muestra mensaje de error

    Examples:
      | data |
      | 0    |

  @IDVACIO
  Scenario Outline: Verificar registro sin ID
    And el usuario no ingresa el ID
      | <data> |
    And el usuario de clic en Save Account Information
    Then el sistema permanece en el formulario de registro

    Examples:
      | data |
      | 0    |

  @PASSWORDVACIO
  Scenario Outline: Verificar registro sin ID
    And el usuario no ingresa los password
      | <data> |
    And el usuario de clic en Save Account Information
    Then el sistema permanece en el formulario de registro

    Examples:
      | data |
      | 0    |


