package com.springframework.msscbeerservices.bootStrap;

import com.springframework.msscbeerservices.Domain.Beer;
import com.springframework.msscbeerservices.repositories.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

   /* public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }*/

    @Override
    public void run(String... args) throws Exception {
        loadBeer();
        showBeer();
    }

    private void showBeer() {
        if(beerRepository.count() > 0){
            System.out.println(beerRepository.findAll());
        }
    }

    private void loadBeer() {

        if(beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Budweiser")
                    .beerStyle("Wheat and Rice")
                    .upc(30001L)
                    .quatityOnBrew(20)
                    .minOnHand(12)
                    .price(new BigDecimal(23.60))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Corona")
                    .beerStyle("PALE_ALE")
                    .upc(30002L)
                    .quatityOnBrew(20)
                    .minOnHand(12)
                    .price(new BigDecimal(20.50))
                    .build());
            System.out.println("load beer - Beerreposiroty Count :" + beerRepository.count());
        }
    }
}
