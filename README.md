# CKBox Spring Boot example

This repository contains an example of a Spring Boot application that integrates CKBox and covers the popular usage scenarios.

The full guide describing the code of this example can be found [in the CKBox Documentation](https://ckeditor.com/docs/ckbox/latest/guides/integrations/frameworks/spring-boot.html).

## Prerequisites
To run this example you will need access credentials required to connect to the CKBox service that you can obtain in the [Customer Portal](https://portal.ckeditor.com).

## Running the application

1. Clone this repository.
2. Enter the project directory.
3. Run the application.

   ```bash
   environment_id=REPLACE-WITH-ENVIRONMENT-ID \
   access_key=REPLACE-WITH-ACCESS-KEY \
   ckeditor_license_key=REPLACE-WITH-CKEDITOR5-LICENSE-KEY \
   ./mvnw spring-boot:run
   ```

4. Open [http://localhost:8080](http://localhost:8080).
