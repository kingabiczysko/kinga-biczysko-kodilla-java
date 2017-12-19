package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private SellService sellService;
    private Repository repository;
    private InfoService infoService;

    public ProductOrderService(final SellService sellService, final Repository repository,
                               final InfoService infoService) {
        this.sellService = sellService;
        this.repository = repository;
        this.infoService = infoService;
    }

    public SalesDto process(final Order order){

        boolean isSold = sellService.isAvailableToSell(order);

        if(isSold) {
            infoService.infoService(order);
            repository.createSalesData(order);
            return new SalesDto(order.getUser(), true);
        }else{
            return new SalesDto(order.getUser(), false);
        }
    }
}
