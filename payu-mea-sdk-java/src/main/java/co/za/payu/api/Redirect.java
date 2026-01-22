/**
 * PayU MEA PHP SDK
 *
 * @copyright  Copyright (c) 2016 PayU
 * @license    http://opensource.org/licenses/LGPL-3.0  Open Software License (LGPL 3.0)
 * @link       http://www.payu.co.za
 * @link       http://help.payu.co.za/developers
 * @author     Kenneth Onah <kenneth@netcraft-devops.com>
 */
package co.za.payu.api;

import co.za.payu.base.ClientCredentials;
import co.za.payu.base.Constants;
import co.za.payu.base.soap.AuthCredential;
import co.za.payu.base.soap.PayUResource;
import co.za.payu.ws.SetTransactionResponseMessage;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.Map;


/**
 * Class Redirect
 *
 * Lets you create, process and manage redirect payments.
 */
public class Redirect extends PayUResource implements IResponse {
    public static final String REDIRECT_URL = Constants.APPROVAL_URL;

    /**
     * PayU redirect url. Customer is redirected to PayU to capture payment details.
     *
     * @return string|null
     */
    public String getPayURedirectUrl()
    {
        Map<String, String> configurationMap = apiContext.getConfigurationMap();
        String mode = configurationMap.get(Constants.MODE);

        String response = getLastResponse();

        Gson gson = new Gson();
        Map<String, String> responseMap = gson.fromJson(response, Map.class);

        if (mode == null || !(mode.equals(Constants.LIVE) || mode.equals(Constants.SANDBOX))) {
            throw new IllegalArgumentException("Mode needs to be either `sandbox` or `live`.");
        }

        String url = String.format(Redirect.REDIRECT_URL,
                mode.equalsIgnoreCase("sandbox") ? "staging" : "secure", responseMap.get("pay_u_reference"));

        return url;
    }
}
