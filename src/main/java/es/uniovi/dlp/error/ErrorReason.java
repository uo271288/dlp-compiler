package es.uniovi.dlp.error;

public enum ErrorReason {
    FIELD_ALREADY_DECLARED("Field already declared in struct"),
    LVALUE_REQUIRED("LValue required"),
    VARIABLE_ALREADY_DECLARED("Variable already declared"),
    FUNCTION_ALREADY_DECLARED("Function already declared"),
    VARIABLE_NOT_DECLARED("Variable not declared"),
    FUNCTION_NOT_DECLARED("Function not declared")
    ;

    private final String message;

    ErrorReason(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
