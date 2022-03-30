#Andrés Giovanny Giraldo Pacheco
  @stories
  Feature: uTest
    As a user I want to perform the steps for registration in uTest page
  @scenario1
  Scenario:Register on the uTest page
  Given than Andres wants to register to enter the uTest page
  When he input the data for registration on the uTest page
    | strFirstName | strSecondName | strEmail            | strMonth | strDay | strYear | strCity | strPostalCode | strPais  | strMovilDivice | strMovilModel | strSoMovil | strPassword    |
    | Andres       | Giraldo       | giovanny@utest.com  | April    | 18     | 1993    | Bogota  | 111061        | Colombia | Apple          | iPad 8        | iOS 10.0   | Andres12345.   |
  Then he enters the uTest page
    | strFinalText      |
    | Complete Setup    |