package com.pg.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import com.pg.domain.Payment;
import com.pg.domain.SuccesfullPayment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Maleen Chethiya
 */
@Path("/payment")
public class PaymentResource {

    private static final Logger log = LoggerFactory.getLogger(PaymentResource.class);

    @POST
    @Consumes("application/json")
    public Response doPayment(Payment payment) {
        log.info("try to do payment. amount is {}", String.valueOf(payment.getAmount()));
        SuccesfullPayment sp = new SuccesfullPayment();
        sp.setAmount(payment.getAmount());
        sp.setMessage("Success");
        sp.setTransactionStatus(1);
        log.info("Payment Success");
        return Response.status(201).entity(sp).build();
    }

    @GET
    @Path("/test")
    @Produces("application/json")
    public Response doPaymentTest() {
        log.info("Test get request in payemnet resource");
        SuccesfullPayment sp = new SuccesfullPayment();
        sp.setAmount(0);
        sp.setMessage("Success");
        sp.setTransactionStatus(1);
        return Response.status(201).entity(sp).build();
    }
}
