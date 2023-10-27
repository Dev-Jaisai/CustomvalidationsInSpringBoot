# Custom Validation and Exception Handling in Spring Boot

This is a sample project that demonstrates how to implement custom validation logic and exception handling in a Spring Boot application. In this project, we handle validation errors using a custom exception handler and a custom validation annotation.

## Validation Logic with Custom Annotation

We have created a custom validation annotation, `@UniqueEmail`, to check the uniqueness of email addresses. It's used to ensure that no duplicate email addresses are allowed during user registration.

- **Custom Annotation Definition:**
  - The `@UniqueEmail` annotation is defined in the `UniqueEmail` class.
  - It is used to mark the email field in the `Employee` entity.

- **Validation Logic:**
  - The validation logic is implemented in the `UniqueEmailValidator` class.
  - It checks if the email is unique by querying the database through a custom repository (in this case, `UserRepository`).

## Custom Exception Handling

We handle validation errors using a custom exception handler, `GlobalException`. This exception handler provides a consistent way to handle validation errors and return meaningful error responses.

- **Exception Handling:**
  - The `GlobalException` class is annotated with `@ControllerAdvice` to create a global exception handler.
  - It uses the `@ExceptionHandler` annotation to handle `MethodArgumentNotValidException`, which is thrown when validation fails.

- **Response Handling:**
  - When a validation error occurs, a custom error message is created and returned as a JSON response.
  - The HTTP status code for validation errors is set to `400 Bad Request`.

## How to Use

1. Clone this repository to your local machine.

2. Set up your database configuration in `application.properties`.

3. Run the Spring Boot application.

4. Try registering a user with a non-unique email address, and you'll receive a validation error response.

## Customization

You can customize the validation logic, error handling, and response format according to your application's requirements. Additionally, replace `CustomError` with your custom error class if needed.

Feel free to use this project as a starting point for implementing custom validation and exception handling in your own Spring Boot applications.

Happy coding!
