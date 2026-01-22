package co.za.payu.base.validators;

import co.za.payu.base.exception.RequiredArgumentException;

public class ArgumentValidator {

    /**
     * Helper method for validating an argument that will be used by this API in any requests.
     *
     * @param argument     mixed The object to be validated
     * @param argumentName string|null The name of the argument.
     *                      This will be placed in the exception message for easy reference
     * @return bool
     * @throws RequiredArgumentException
     */
    public static boolean validate(String argument, String argumentName) throws RequiredArgumentException
    {
        if (argument == null) {
            // Error if Object Null
            throw new RequiredArgumentException(argumentName + " cannot be null");
        } else if (argument.equals("")) {
            // Error if String Empty
            throw new RequiredArgumentException(argumentName + " string cannot be empty");
        }

        return true;
    }
}
