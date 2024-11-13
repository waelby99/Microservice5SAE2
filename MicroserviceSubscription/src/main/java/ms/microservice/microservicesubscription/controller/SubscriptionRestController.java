package ms.microservice.microservicesubscription.controller;

import lombok.RequiredArgsConstructor;
import ms.microservice.microservicesubscription.entities.Subscription;
import ms.microservice.microservicesubscription.services.ISubscriptionServices;
import org.springframework.web.bind.annotation.*;
import ms.microservice.microservicesubscription.entities.TypeSubscription;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/subscription")
@RequiredArgsConstructor
public class SubscriptionRestController {
    private final ISubscriptionServices subscriptionServices;
    @PostMapping("/add")
    public Subscription addSubscription(@RequestBody Subscription subscription){
        return  subscriptionServices.addSubscription(subscription);
    }
    @GetMapping("/get/{id-subscription}")
    public Subscription getById(@PathVariable("id-subscription") Long numSubscription){
        return subscriptionServices.retrieveSubscriptionById(numSubscription);
    }
    @GetMapping("/all/{typeSub}")
    public Set<Subscription> getSubscriptionsByType(@PathVariable("typeSub") TypeSubscription typeSubscription){
        return subscriptionServices.getSubscriptionByType(typeSubscription);
    }
    @PutMapping("/update")
    public Subscription updateSubscription(@RequestBody Subscription subscription){
        return  subscriptionServices.updateSubscription(subscription);
    }

    @GetMapping("/all/{date1}/{date2}")
    public List<Subscription> getSubscriptionsByDates(@PathVariable("date1") LocalDate startDate,
                                                      @PathVariable("date2") LocalDate endDate){
        return subscriptionServices.retrieveSubscriptionsByDates(startDate, endDate);
    }

}
