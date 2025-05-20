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
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Class PaymentMethod
 *
 * A payment card that can fund a payment.
 *
 * @package co.za.payu.api
 */
@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PaymentMethod extends PayUModel {
    public static final String TYPE_CREDITCARD = "CREDITCARD";
    public static final String TYPE_DEBIT_ORDER = "DEBIT_ORDER";
    public static final String TYPE_EFT_PRO = "EFT_PRO";
    public static final String TYPE_SMARTEFT = "SMARTEFT";
    public static final String TYPE_EBUCKS = "EBUCKS";
    public static final String TYPE_CREDITCARD_TOKEN = "CREDITCARD_TOKEN";
    public static final String TYPE_DISCOVERYMILES = "DISCOVERYMILES";
    public static final String TYPE_REAL_TIME_RECURRING = "REAL_TIME_RECURRING";
}
