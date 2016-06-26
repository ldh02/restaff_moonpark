package com.restaff.moonpark.vo;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by DHLE on 6/26/2016.
 */
@XmlRootElement
public class PriceResponse implements Serializable {
    private float price;
}
