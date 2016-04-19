package mypckg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Ксения on 4/19/2016.
 */
@RestController
@Path("/buyer")
public class BuyerRestController {
    ApplicationContext context = new GenericXmlApplicationContext("config.xml");
    BuyerDAO buyerDAO = (BuyerDAO) context.getBean("buyerDAO");
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Buyer> getAllBuyers() {
        List<Buyer> list = buyerDAO.searchAll();
        return list;
    }

    @GET
    @Path("/1")
    @Produces(MediaType.APPLICATION_JSON)
    public Buyer getBuyer(){
      Buyer buyer = buyerDAO.searchLine(1);
        return buyer;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/json")
    public Status postBuyer(Buyer buyer) {
        buyerDAO.addLine(buyer);
        Status status = new Status("add");
        return status;
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Status deleteAllBuyers() {
        buyerDAO.deleteAll();
        Status status = new Status("deleteAll");
        return status;
    }

    @DELETE
    @Path("/4")
    @Produces(MediaType.APPLICATION_JSON)
    public Status deleteBuyer(){
        buyerDAO.deleteLine(4);
        Status status = new Status("delete");
        return status;
    }
}
