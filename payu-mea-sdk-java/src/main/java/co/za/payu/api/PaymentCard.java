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

import java.util.List;

/**
 * Class PaymentCard
 *
 * A payment card that can fund a payment.
 *
 * @package co.za.payu.api
 */
@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PaymentCard extends PayUModel {
    public static final String TYPE_VISA = "VISA";
    public static final String TYPE_MASTERCARD = "MASTERCARD";
    public static final String TYPE_MAESTRO = "MAESTRO";
    public static final String TYPE_DISCOVERYMILES = "DISCOVERYMILES";

    /**
     * Default Constructor
     */
    public PaymentCard() {
    }
}
