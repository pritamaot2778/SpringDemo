okta-spring-poc-ms on AKS : 

       local       :  http://localhost:9080/   
       local-Okta  :  http://localhost:9080/authorization-code/callback
=========================================================================       
AKS - 

1)     URL      : http://20.106.64.12:9080/
				  http://20.106.64.12:9080/authorization-code/callback			  
				   
2)     Username : ashwinshah007@gmail.com
3)     Password : Okta@2022

4)     Username : ashwinshah9080@gmail.com
5)     Password : Blue@2022

**************************************************************************
Docker

      run below cmd to build 
6)    C:\Users\0038J4744\Desktop\application\POC-Okta\OktaOAuthClient> docker build -t okta-auth-spring-poc-ms .

7)    login Okta : https://developer.okta.com/signup/
 				   https://dev-21775997-admin.okta.com/admin/getting-started


un cmd on docker   :    docker run -p 9080:9080 okta-spring-poc-ms