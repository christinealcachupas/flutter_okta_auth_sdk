package com.bluestork.flutter_okta_auth_sdk.okta.operations

import com.okta.oidc.RequestCallback
import com.okta.oidc.Tokens
import com.okta.oidc.util.AuthorizationException
import com.bluestork.flutter_okta_auth_sdk.okta.entities.Constants
import com.bluestork.flutter_okta_auth_sdk.okta.entities.Errors
import com.bluestork.flutter_okta_auth_sdk.okta.entities.OktaClient
import com.bluestork.flutter_okta_auth_sdk.okta.entities.PendingOperation



fun refreshTokens() {
    OktaClient.getWebClient().sessionClient.refreshToken(object : RequestCallback<Tokens, AuthorizationException> {
        override fun onSuccess(result: Tokens) {
            val params = mutableMapOf<Any, Any?>()
            params[Constants.ACCESS_TOKEN_KEY] = result.accessToken
            params[Constants.ID_TOKEN_KEY] = result.idToken
            params[Constants.REFRESH_TOKEN_KEY] = result.refreshToken
            PendingOperation.success(params.toString())
        }

        override fun onError(e: String, exception: AuthorizationException) {
            PendingOperation.error(Errors.OKTA_OIDC_ERROR, exception.errorDescription)
        }
    })
}


