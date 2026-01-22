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

import co.za.payu.base.soap.PayUModel;

/**
 * Class EFTBase
 *
 * Lets you create, process and manage EFT based payments.
 *
 * @package co.za.payu.api
 */
public class EFTBase extends PayUModel {

    public static final String FNB = "FNB";
    public static final String ABSA = "ABSA";
    public static final String NEDBANK = "NEDBANK";
    public static final String STANDARD_BANK = "STANDARD_BANK";

    /**
     * Eft amounts to pay.
     */
    private String amount;
    /**
     * Indicates the HTTP method that needs to be implemented, i.e. HTTP GET or HTTP POST
     */
    private String method;
    /**
     * Type of payment
     */
    private String type;
    /**
     * Redirect url. Customer is directed to a web page that provides a list of banks that accepts the
     * EFT Pro product as a payment method
     */
    private String url;
    /**
     * Name of customer's bank
     */
    private String bankName;
}
