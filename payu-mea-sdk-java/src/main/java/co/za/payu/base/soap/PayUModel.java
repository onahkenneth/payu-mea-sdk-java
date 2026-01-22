package co.za.payu.base.soap;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class PayUModel {
    /**
     * Returns a JSON string corresponding to object state
     *
     * @return JSON representation
     */
    public String toJSON() {
        return JSONFormatter.toJSON(this);
    }

    @Override
    public String toString() {
        return toJSON();
    }
}
