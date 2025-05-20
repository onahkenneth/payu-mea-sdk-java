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
 * Class TransactionBase
 *
 * A transaction defines the contract of a payment - what is the payment for and who is fulfilling it.
 *
 * @package co.za.payu.api
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TransactionBase extends PayUModel {
    public static final String STATE_NEW = "NEW";
    public static final String STATE_PROCESSING = "PROCESSING";
    public static final String STATE_TIMEOUT = "TIMEOUT";
    public static final String STATE_FAILED = "FAILED";
    public static final String STATE_EXPIRED = "EXPIRED";
    public static final String STATE_SUCCESSFUL = "SUCCESSFUL";
    public static final String STATE_AWAITING_PAYMENT = "AWAITING_PAYMENT";

    public static final String TYPE_PAYMENT = "PAYMENT"; // means a sale
    public static final String TYPE_RESERVE = "RESERVE"; // means authorize payment
    public static final String TYPE_CREDIT = "CREDIT"; // means a refund
    public static final String TYPE_FINALIZE = "FINALIZE"; // means capture an authorized payment
    public static final String TYPE_RESERVE_CANCEL = "RESERVE_CANCEL"; // means reverse an authorization
    public static final String TYPE_DEBIT_ORDER = "DEBIT_ORDER";
    public static final String TYPE_ONCE_OFF_PAYMENT_AND_DEBIT_ORDER = "ONCE_OFF_PAYMENT_AND_DEBIT_ORDER"; // debit order with payment
    public static final String TYPE_ONCE_OFF_RESERVE_AND_DEBIT_ORDER = "ONCE_OFF_RESERVE_AND_DEBIT_ORDER"; // debit order with reserve

    /**
     * The showBudget flag provides for budget payment.
     */
    private boolean showBudget;
}
