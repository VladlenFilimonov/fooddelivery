package accenture.team3.fooddelivery.services.exceptions;

import org.springframework.validation.BindingResult;

public class ArgumentValidationException extends RuntimeException {

    private BindingResult result;

    public ArgumentValidationException(BindingResult result) {
        super();
        this.result = result;
    }

    public BindingResult getResult() {
        return result;
    }
}
