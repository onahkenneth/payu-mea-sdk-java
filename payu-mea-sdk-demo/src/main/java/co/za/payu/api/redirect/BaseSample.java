package co.za.payu.api.redirect;

import jakarta.servlet.http.HttpServletRequest;

public class BaseSample {
    public static String getBaseUrl(HttpServletRequest request) {
        String url = request.getRequestURL().toString();
        return url.substring(0, url.length() - request.getRequestURI().length()) + request.getContextPath() + "/";
    }
}
