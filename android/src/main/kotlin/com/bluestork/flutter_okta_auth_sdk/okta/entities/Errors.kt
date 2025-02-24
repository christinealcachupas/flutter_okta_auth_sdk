package com.bluestork.flutter_okta_auth_sdk.okta.entities

enum class Errors(val errorCode: String, val errorMessage: String) {
    NOT_CONFIGURED(
            "-100",
            "OktaOidc client isn't configured, check if you have created a configuration with createConfig"),
    NO_VIEW("-200", "No current view exists"),
    NO_ID_TOKEN("-500", "Id token does not exist"),
    OKTA_OIDC_ERROR("-600", "Okta Oidc error"),
    ERROR_TOKEN_TYPE("-700", "Token type not found"),
    NO_ACCESS_TOKEN("-900", "No access token found"),
    NO_REFRESH_TOKEN("-901", "No refresh token found"),
    SIGN_IN_FAILED("-1000", "Sign in was not authorized"),
    GENERIC_ERROR("-1100", "Generic Error"),
    METHOD_NOT_IMPLEMENTED("-1200", "This method is not implemented"),
    NO_CONTEXT("-1300", "No current context exists"),
    CANCELLED_ERROR("-1400", "Operation cancelled"),
}
