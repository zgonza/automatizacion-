Feature: online purchase

#Background: 
#Given Dado un usuario con clave y password
#When cuando ingreso las credenciales
#Then el usuario se logueo en la aplicacion

Scenario: User Registrer
Since I want to register on the page
When I fill in all the mandatory fields of the form 
Then I must be registered in the system

Scenario: summer dress purchase
Since I login in the online store
And I select the category of summer dresses
And I select the most economical dress from the list of results
When I buy the dress
And payment by check
Then I bought the dress  

#Since I have the purchase order for a dress
When entering the purchase history
Then I see the purchase order in the history

